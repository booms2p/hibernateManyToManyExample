package com.waramun;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class FootballPlayer implements java.io.Serializable {

	private Integer playerId;
	private String playerFname;
	private String playerLname;
	private Date playerBirthdate;
	private Integer countryId;
	private Set<EplClub> eplClub = new HashSet<EplClub>(0);
	
	public FootballPlayer() {
	}

	public FootballPlayer(String playerFname, String playerLname, Date playerBirthdate, Integer countryId) {
		this.playerFname = playerFname;
		this.playerLname = playerLname;
		this.playerBirthdate = playerBirthdate;
		this.countryId = countryId;
	}

	public FootballPlayer(String playerFname, String playerLname, Date playerBirthdate, Integer countryId, Set<EplClub> eplClub) {
		this.playerFname = playerFname;
		this.playerLname = playerLname;
		this.playerBirthdate = playerBirthdate;
		this.countryId = countryId;
		this.eplClub = eplClub;
	}
	
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getPlayerFname() {
		return playerFname;
	}
	public void setPlayerFname(String playerFname) {
		this.playerFname = playerFname;
	}
	public String getPlayerLname() {
		return playerLname;
	}
	public void setPlayerLname(String playerLname) {
		this.playerLname = playerLname;
	}
	public Date getPlayerBirthdate() {
		return playerBirthdate;
	}
	public void setPlayerBirthdate(Date playerBirthdate) {
		this.playerBirthdate = playerBirthdate;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public Set<EplClub> getEplClub() {
		return eplClub;
	}
	public void setEplClub(Set<EplClub> eplClub) {
		this.eplClub = eplClub;
	}
	
}
