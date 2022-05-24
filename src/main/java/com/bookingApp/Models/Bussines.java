package com.bookingApp.Models;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bussines")
public class Bussines {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int bussinesId;
    @Column(unique=true)
    private String name;
    @Column(unique=true)
    private String socialRazon;
    private String email;
    private String password;
    private ArrayList<Booking> bookings;
    private int nextBookingId;

    public Bussines(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.bookings = new ArrayList();
        this.nextBookingId=1;
    }

    public String getSocialRazon() {
        return socialRazon;
    }

    public void setSocialRazon(String socialRazon) {
        this.socialRazon = socialRazon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public boolean addBookings(Booking oneBooking) {
        boolean result = false;
        oneBooking.setBookingId(nextBookingId);
        oneBooking.setBussines(this);
        if (oneBooking.valid()) {
            this.bookings.add(oneBooking);
            this.nextBookingId++;
            result = true;
        }
        return result;
    }

    public int getBussinesId() {
        return bussinesId;
    }

    public void setBussinesId(int bussinesId) {
        this.bussinesId = bussinesId;
    }

    public boolean valid() {
        return !this.name.equals("")
                && !this.email.equals("")
                && !this.password.equals("")
                && !this.socialRazon.equals("");
    }
}
