package com.umit.controller;

import com.umit.entity.Celebrity;
import com.umit.service.CelebrityService;

import java.util.List;

public class CelebrityController {

    CelebrityService celebrityService;

    public CelebrityController(){
        this.celebrityService= new CelebrityService();
    }

    public List<Celebrity> findAll() {
        return celebrityService.findAll();
    }
}
