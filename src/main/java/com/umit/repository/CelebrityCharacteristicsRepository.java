package com.umit.repository;

import com.umit.entity.CelebrityCharacteristics;

public class CelebrityCharacteristicsRepository extends RepositoryManager<CelebrityCharacteristics,Long>{

    public CelebrityCharacteristicsRepository(){
        super(new CelebrityCharacteristics());
    }
}
