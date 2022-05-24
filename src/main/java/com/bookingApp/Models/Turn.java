/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookingApp.Models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tomas
 */
@Entity
@Table(name="Turns")
public class Turn {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int turnId;
    private Date bookingStart;
    private Date bookingEnd;
    private User user;

    public Turn(Date bookingStart, Date bookingEnd) {
        this.bookingStart = bookingStart;
        this.bookingEnd = bookingEnd;
    }

    public int getTurnId() {
        return turnId;
    }

    public void setTurnId(int turnId) {
        this.turnId = turnId;
    }

    public Date getBookingStart() {
        return bookingStart;
    }

    public void setBookingStart(Date bookingStart) {
        this.bookingStart = bookingStart;
    }

    public Date getBookingEnd() {
        return bookingEnd;
    }

    public void setBookingEnd(Date bookingEnd) {
        this.bookingEnd = bookingEnd;
    }

    public User getUser() {
        return user;
    }
    
    public boolean addUsertoTurn(User user) {
        boolean result = false;
        if (user != null) {
            this.user=user;
            result=true;
        }
        return result;
    }
    
    public boolean validateTurn(){
        return this.bookingStart.before(this.bookingEnd);
    }
    
}
