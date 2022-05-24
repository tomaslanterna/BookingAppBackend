package com.bookingApp.Controllers;

import com.bookingApp.Models.Bussines;
import com.bookingApp.Service.BussinesService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bussines")
public class BussinesController{
    
    @Autowired
    private BussinesService bussinesService;
    
    @GetMapping
    public List<Bussines> getBussines(){
        return bussinesService.getBussines();
    }
    
    @PostMapping
    public Bussines addBussines(@RequestBody Bussines oneBussines){
        return bussinesService.addBussines(oneBussines);
    }
}