/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookingApp.Models;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class ControlUser {
    
    private ArrayList<User> users= new ArrayList();
    
    protected ControlUser(){
    }

    public ArrayList<User> getUsers() {
        return users;
    }
    
    public void addUser(User oneUser){
        users.add(oneUser);
    }
}
