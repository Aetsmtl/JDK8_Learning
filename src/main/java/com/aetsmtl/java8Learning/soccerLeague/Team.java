package com.aetsmtl.java8Learning.soccerLeague;

public class Team {
	
	protected String name;
	protected Player[] players;
	
	public Team(String name, Player[] players) {
		super();
		this.name = name;
		this.players = players;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}

	
}
