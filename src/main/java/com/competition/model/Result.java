package com.example.competition.model;

public class Result {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private String winner;

    public Result() {}

    public String getHomeTeam() { return homeTeam; }
    public void setHomeTeam(String homeTeam) { this.homeTeam = homeTeam; }

    public String getAwayTeam() { return awayTeam; }
    public void setAwayTeam(String awayTeam) { this.awayTeam = awayTeam; }

    public int getHomeScore() { return homeScore; }
    public void setHomeScore(int homeScore) { this.homeScore = homeScore; }

    public int getAwayScore() { return awayScore; }
    public void setAwayScore(int awayScore) { this.awayScore = awayScore; }

    public String getWinner() { return winner; }
    public void setWinner(String winner) { this.winner = winner; }
}
