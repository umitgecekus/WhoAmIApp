package com.umit.service;

import com.umit.entity.Celebrity;
import com.umit.repository.CelebrityRepository;

import java.util.List;

public class CelebrityService {

    CelebrityRepository celebrityRepository;

    public CelebrityService(){
        this.celebrityRepository = new CelebrityRepository();
    }

    public List<Celebrity> findAll() {
        return celebrityRepository.findAll();
    }
}
