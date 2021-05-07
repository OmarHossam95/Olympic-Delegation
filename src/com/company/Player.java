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
public class Player extends Person {
    Coach coach;
    String medal;
    
    public Player(String name, String address, Coach coach){
        this.name = name;
        this.address = address;
        this.coach = coach;
        this.medal = "";
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
    }
}
