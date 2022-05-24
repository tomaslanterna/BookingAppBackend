/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookingApp.Service;


import com.bookingApp.Models.Bussines;
import com.bookingApp.Repository.BussinesRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author tomas
 */
@Service
public class BussinesService {
    
    @Autowired
    private BussinesRepo bussinesRepo;
    
    public Bussines addBussines(Bussines oneBussines){
        return bussinesRepo.save(oneBussines);
    }
    
    public List<Bussines> getBussines(){
        return bussinesRepo.findAll();
    }
    
}
