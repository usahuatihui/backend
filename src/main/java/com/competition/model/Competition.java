package com.example.competition.model;

import java.util.List;

public class Competition {
    private int id;
    private String name;
    private String date;
    private String location;
    private String sport;
    private List<Team> teams;
    private Result result;

    public Competition() {}

    public Competition(int id, String name, String date, String location, String sport) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.location = location;
        this.sport = sport;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getSport() { return sport; }
    public void setSport(String sport) { this.sport = sport; }

    public List<Team> getTeams() { return teams; }
    public void setTeams(List<Team> teams) { this.teams = teams; }

    public Result getResult() { return result; }
    public void setResult(Result result) { this.result = result; }
}
