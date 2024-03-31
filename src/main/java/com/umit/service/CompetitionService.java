package com.umit.service;

import com.umit.entity.Competition;
import com.umit.repository.CompetitionRepository;

public class CompetitionService {

    CompetitionRepository competitionRepository;

    public CompetitionService(){
        this.competitionRepository = new CompetitionRepository();
    }


    public Competition save(Competition competition) {
        return competitionRepository.save(competition);
    }
}
