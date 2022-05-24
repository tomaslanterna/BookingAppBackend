package com.bookingApp.Models;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int bookingId;
    private ArrayList<Turn> turns;
    private boolean state;
    private Bussines bussines;
    private int amountTurns;
    private int nextTurnId;

    public Booking(int amountTurns) {
        this.state = false;
        this.amountTurns = amountTurns;
        this.turns = new ArrayList(amountTurns);
        this.nextTurnId=1;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Bussines getBussines() {
        return bussines;
    }

    public boolean setBussines(Bussines bussines) {
        boolean result = false;
        if (bussines.valid()) {
            this.bussines = bussines;
            result = true;
        }
        return result;
    }

    public int getAmountTurns() {
        return amountTurns;
    }

    public void setAmountTurns(int amountTurns) {
        this.amountTurns = amountTurns;
    }

    public boolean addTurn(Turn turn) {
        boolean result = false;
        int count = 0;
        if (turn != null && turn.validateTurn()) {
            do {
                turn.setTurnId(nextTurnId);
                this.turns.add(turn);
                this.nextTurnId++;
                count++;
            } while (count <= this.amountTurns);
            result = true;
        }
        return result;
    }

    public ArrayList<Turn> getTurns() {
        return this.turns;
    }

    public boolean verifyTurns() {
        boolean result = false;
        if (this.turns.size() <= this.amountTurns) {
            result = true;
        }
        return result;
    }

    public boolean valid() {
        return !turns.isEmpty()
                && bussines != null
                && amountTurns > 0;
    }

}
