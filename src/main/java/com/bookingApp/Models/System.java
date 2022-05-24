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
public class System {

    private static System instance;

    private ControlBooking controlBooking = new ControlBooking();
    private ControlUser controlUser = new ControlUser();
    private ControlBussines controlBussines = new ControlBussines();

    public static System getInstance() {
        if (instance == null) {
            instance = new System();
        }
        return instance;
    }

    private System() {
    }

    public ControlBooking getControlBooking() {
        return controlBooking;
    }

    public ControlUser getControlUser() {
        return controlUser;
    }

    public ControlBussines getControlBussines() {
        return controlBussines;
    }

    public ArrayList<Bussines> getBussines() {
        return controlBussines.getBussines();
    }

    public boolean createBussines(Bussines oneBussines) {
        return controlBussines.createBussines(oneBussines);
    }

    public ArrayList<User> getUsers() {
        return controlUser.getUsers();
    }

    public void addUser(User oneUser) {
        controlUser.addUser(oneUser);
    }
    
    

}
