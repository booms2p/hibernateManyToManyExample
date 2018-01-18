package com.waramun;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.waramun.FootballPlayer;
import com.waramun.EplClub;
import com.waramun.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("Process Start");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
//		Add data
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
//		===========================
		
//		Delete data
//		FootballPlayer player = (FootballPlayer)session.get(FootballPlayer.class, 28);
//		EplClub club = (EplClub)session.get(EplClub.class, 3);
//		player.getEplClub().remove(club);
//		===========================
		
//		String stm = "FROM FootballPlayer FP WHERE FP.playerLname = 'เคน'";
//		Integer a = 0; 
//		Query query = session.createQuery(stm);
//		List res = query.list();
//		for (Iterator iterator = res.iterator(); iterator.hasNext();){
//			FootballPlayer playerRes = (FootballPlayer) iterator.next();
//			System.out.print(playerRes.getPlayerFname());
//			System.out.print(" ");
//			System.out.print(playerRes.getPlayerLname());
//			System.out.println("");
//			a = playerRes.getPlayerId();
//		}
//		
//		System.out.println(a);
//		FootballPlayer player = (FootballPlayer)session.get(FootballPlayer.class, a);
//		session.delete(player);
//		
//		===========================
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Process Done.");
		
	}

}
