/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Game {
    
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    
    public Game(String home, String away, int homeScore, int awayScore) {
        homeTeam = home;
        awayTeam = away;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    public String getHome() {
        return homeTeam;
    }
    
    public String getAway() {
        return awayTeam;
    }
    
    public int getHomeScore() {
        return homeScore;
    }
    
    public int getAwayScore() {
        return awayScore;
    }
}
