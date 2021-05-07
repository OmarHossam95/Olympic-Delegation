/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author omarh
 */
public class Delegation {
    Player[] players;
    Coach[] coaches;
    String country;
    
    public Delegation(Player[] players, Coach[] coaches, String country){
        this.players = players;
        this.coaches = coaches;
        this.country = country;
    }
    
    public void setPlayers(Player[] players){
        this.players = players;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setCoaches(Coach[] coaches){
        this.coaches = coaches;
    }

    public Coach[] getCoaches() {
        return coaches;
    }

    public void setCountry(String country){
        this.country = country;
    }


    public String getCountry() {
        return country;
    }
}
