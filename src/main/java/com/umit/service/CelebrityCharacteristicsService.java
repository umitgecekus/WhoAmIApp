package com.umit.service;

import com.umit.repository.CelebrityCharacteristicsRepository;

public class CelebrityCharacteristicsService {

    CelebrityCharacteristicsRepository celebrityCharacteristicsRepository;

    public CelebrityCharacteristicsService(){
        this.celebrityCharacteristicsRepository = new CelebrityCharacteristicsRepository();
    }


}
