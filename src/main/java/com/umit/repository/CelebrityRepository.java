package com.umit.repository;

import com.umit.entity.Celebrity;

public class CelebrityRepository extends RepositoryManager<Celebrity,Long>{

    public CelebrityRepository(){
        super(new Celebrity());
    }
}
