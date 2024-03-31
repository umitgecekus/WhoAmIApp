package com.umit.service;

import com.umit.entity.Competitor;
import com.umit.repository.CompetitorRepository;

import java.util.List;

public class CompetitorService {

    CompetitorRepository competitorRepository;

    public CompetitorService(){
        this.competitorRepository = new CompetitorRepository();
    }


    public List<Competitor> findAll() {
        return competitorRepository.findAll();
    }

    public Competitor updateWinner(Competitor winner) {
        return competitorRepository.update(winner);
    }
}
