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
public class ControlBooking {
    
    private ArrayList<Booking> bookings=new ArrayList();
    
    protected ControlBooking(){
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }
    
    /*Tengo que ver si voy a tener una lista de bookings generales, de no ser asi esto no es necesario
    public boolean addBooking(Booking oneBooking){
        boolean result=false;
        if(oneBooking.valid()){
            bookings.add(oneBooking);
        }
        return result;
    }*/
    
}
