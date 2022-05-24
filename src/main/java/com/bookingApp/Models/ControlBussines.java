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
public class ControlBussines {
    
    private ArrayList<Bussines> bussines=new ArrayList();
    private int nextBussinesId=1;
   
    
    protected ControlBussines(){
    }

    public ArrayList<Bussines> getBussines() {
        return bussines;
    }
    
    public boolean createBussines(Bussines oneBussines){
        boolean result=false;
        if(oneBussines.valid()){
            oneBussines.setBussinesId(nextBussinesId);
            bussines.add(oneBussines);
            nextBussinesId++;
            result=true;
        }
        return result;
    }
    
}
