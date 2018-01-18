package com.waramun;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.waramun.FootballPlayer;
import com.waramun.EplClub;
import com.waramun.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		
		MainApp main = new MainApp();
		
//		main.read();
		
//		main.delete();
		
//		main.add();
		
//		main.update(17, "เดเล่", "อัลลีย์");
		
		main.read();
	}
	
	public void read() {
		
		System.out.println("Process Start");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = null;
		
		try {
			
			trx = session.beginTransaction();
			String stm = "FROM FootballPlayer";
			Query query = session.createQuery(stm);
			List res = query.list();
			for (Iterator iterator = res.iterator(); iterator.hasNext();){
				FootballPlayer playerRes = (FootballPlayer) iterator.next();
				System.out.print("ID: " + playerRes.getPlayerId());
				System.out.print(", FirstName: " + playerRes.getPlayerFname());
				System.out.println(", LastName: " + playerRes.getPlayerLname());
				
				Set club = playerRes.getEplClub();
				for(Iterator iterator2 = club.iterator(); iterator2.hasNext();) {
					EplClub clubList = (EplClub) iterator2.next();
					System.out.print("Club: " + clubList.getClubName());
					System.out.println("");
				}
				System.out.println("=====================================================");
			}
			
		} catch(HibernateException e) {
			if (trx != null) trx.rollback();
			e.printStackTrace();
			
		} finally {
			session.close();
			System.out.println("Process Done.");
			
		}
		
	}
	
	@SuppressWarnings("unused")
	public void add() {
		
		System.out.println("Process Start");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = null;
		
		try {
			trx = session.beginTransaction();
			
			FootballPlayer player = new FootballPlayer();
			player.setPlayerFname("แฮรี่");
			player.setPlayerLname("เคน");
			player.setCountryId(1);
			Date date = java.sql.Date.valueOf("1993-07-28");
			player.setPlayerBirthdate(date);

			Set<EplClub> eplClub = new HashSet<EplClub>();
			eplClub.add(new EplClub(1, 0000, "Tottenham Hotspur"));
			eplClub.add(new EplClub(1, 0000, "Spur"));
			
			player.setEplClub(eplClub);
			
			session.save(player);
			session.getTransaction().commit();
			
		} catch (HibernateException e) {
			if (trx != null) trx.rollback();
			e.printStackTrace();
			
		} finally {
			session.close();
			System.out.println("Process Done.");
		}
		
	}
	
	public void update(int id, String fName, String lName) {
		
		System.out.println("Process Start");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = null;
		
		try {
			trx = session.beginTransaction();
			FootballPlayer player = (FootballPlayer)session.get(FootballPlayer.class, id);
			if (fName != null && fName != "") player.setPlayerFname(fName); 
			
			if (lName != null && lName != "") player.setPlayerLname(lName);
			
			if ((fName != null && fName != "") || (lName != null && lName != "")) {
				session.update(player);
				trx.commit();
			} 
			
		} catch(HibernateException e) {
			if (trx != null) trx.rollback();
			e.printStackTrace();
			
		} finally {
			session.close();
			System.out.println("Process Done.");
			
		}
		
	}
	
	@SuppressWarnings({ "unused", "rawtypes" })
	public void delete () {
		
		System.out.println("Process Start");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = null;
		
		try {
			trx = session.beginTransaction();
			
			String stm = "FROM FootballPlayer FP WHERE FP.playerLname = 'เคน'";
			Integer playerId = 0; 
			Query query = session.createQuery(stm);
			List res = query.list();
			for (Iterator iterator = res.iterator(); iterator.hasNext();){
				FootballPlayer playerRes = (FootballPlayer) iterator.next();
				System.out.print(playerRes.getPlayerFname());
				System.out.print(" ");
				System.out.print(playerRes.getPlayerLname());
				System.out.println("");
				playerId = playerRes.getPlayerId();
			}
			
			if (playerId > 0) {
				System.out.println(playerId);
				FootballPlayer player = (FootballPlayer)session.get(FootballPlayer.class, playerId);
				session.delete(player);
				session.getTransaction().commit();
			} else {
				System.out.println("Cannot find specify player data.");
			}
			
		} catch (HibernateException e) {
			if (trx != null) trx.rollback();
			e.printStackTrace();
			
		} finally {
			session.close();
			System.out.println("Process Done.");
			
		}
		
	}

}
