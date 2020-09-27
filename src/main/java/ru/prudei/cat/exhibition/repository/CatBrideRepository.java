package ru.prudei.cat.exhibition.repository;

import ru.prudei.cat.exhibition.model.Cat;

import java.util.Set;

public class CatBrideRepository {

    private Set<Cat> brides;

    public CatBrideRepository(Set<Cat> brides) {
        this.brides = brides;
    }


    public Cat getBrite(){
        return brides.iterator().next();
    }
}
