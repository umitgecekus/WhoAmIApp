package com.umit.repository;

import com.umit.entity.Competition;

public class CompetitionRepository extends RepositoryManager<Competition,Long>{

    public CompetitionRepository(){
        super(new Competition());
    }
}
