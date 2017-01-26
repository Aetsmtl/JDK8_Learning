package com.aetsmtl.java8Learning.soccerLeague;

public class Game {
	
	protected Team homeTeam;
	protected Team awayTeam;
	protected Goal[] goals;
	
	
	
	public Game(Team homeTeam, Team awayTeam, Goal[] goals) {
		super();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.goals = goals;
	}
	
	public Team getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	public Team getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	public Goal[] getGoals() {
		return goals;
	}
	public void setGoals(Goal[] goals) {
		this.goals = goals;
	}

	

}
