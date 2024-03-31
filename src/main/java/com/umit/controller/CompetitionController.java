package com.umit.controller;

import com.umit.entity.Competition;
import com.umit.service.CompetitionService;

public class CompetitionController {

    CompetitionService competitionService;

    public CompetitionController(){
        this.competitionService= new CompetitionService();
    }

    public Competition save(Competition competition) {
        return competitionService.save(competition);
    }
}
