package com.umit.repository;

import com.umit.entity.Competitor;

public class CompetitorRepository extends RepositoryManager<Competitor,Long>{

    public CompetitorRepository(){
        super(new Competitor());
    }
}
