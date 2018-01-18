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
		
//		main.delete();
		
//		main.add();
	}
	
	@SuppressWarnings("unused")
	public void add() {
		
		System.out.println("Process Start");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = null;
		
		try {
			session.beginTransaction();
			
			FootballPlayer player = new FootballPlayer();
			player.setPlayerFname("แฮรี่");
			player.setPlayerLname("เคน");
			player.setCountryId(1);
			Date date = java.sql.Date.valueOf("1993-07-28");
			player.setPlayerBirthdate(date);
			
			EplClub club = new EplClub(1, 0000, "Tottenham Hotspur");

			Set<EplClub> eplClub = new HashSet<EplClub>();
			eplClub.add(club);
			
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
	
	@SuppressWarnings({ "unused", "rawtypes" })
	public void delete () {
		
		System.out.println("Process Start");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trx = null;
		
		try {
			session.beginTransaction();
			
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
