package com.aetsmtl.java8Learning.soccerLeague;

public class Goal {

	protected Team team;
	protected Player player;
	protected double time;
	
	public Goal(Team team, Player player, double time) {
		super();
		this.team = team;
		this.player = player;
		this.time = time;
	}
	
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	
	
}
