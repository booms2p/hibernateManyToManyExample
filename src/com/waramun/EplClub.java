package com.waramun;

import java.util.HashSet;
import java.util.Set;

public class EplClub implements java.io.Serializable {
	
	private Integer clubId, stadiumId, lastestEplChamp;
	private String clubName;
	private Set<FootballPlayer> footballPlayer = new HashSet<FootballPlayer>(0);
	
	public EplClub() {
	}

	public EplClub(Integer stadiumId, Integer lastestEplChamp, String clubName) {
		this.stadiumId = stadiumId;
		this.lastestEplChamp = lastestEplChamp;
		this.clubName = clubName;
	}

	public EplClub(Integer stadiumId, Integer lastestEplChamp, String clubName, Set<FootballPlayer> footballPlayer) {
		this.stadiumId = stadiumId;
		this.lastestEplChamp = lastestEplChamp;
		this.clubName = clubName;
		this.footballPlayer = footballPlayer;
	}
	
	public Integer getClubId() {
		return clubId;
	}
	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}
	public Integer getStadiumId() {
		return stadiumId;
	}
	public void setStadiumId(Integer stadiumId) {
		this.stadiumId = stadiumId;
	}
	public Integer getLastestEplChamp() {
		return lastestEplChamp;
	}
	public void setLastestEplChamp(Integer lastestEplChamp) {
		this.lastestEplChamp = lastestEplChamp;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public Set<FootballPlayer> getFootballPlayer() {
		return footballPlayer;
	}
	public void setFootballPlayer(Set<FootballPlayer> footballPlayer) {
		this.footballPlayer = footballPlayer;
	} 
	
	
}
