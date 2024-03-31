package com.umit.controller;

import com.umit.entity.Competitor;
import com.umit.service.CompetitorService;

import java.util.List;

public class CompetitorController {

    CompetitorService competitorService;
    public CompetitorController(){
        this.competitorService= new CompetitorService();
    }

    public List<Competitor> findAll() {
        return competitorService.findAll();
    }

    public Competitor updateWinner(Competitor winner) {
        return competitorService.updateWinner(winner);
    }
}
