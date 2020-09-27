package ru.prudei.cat.exhibition.service;

import ru.prudei.cat.exhibition.model.Cat;

import java.util.Optional;

public class Family {

    private ExhibitionService exhibitionService;
    private Cat mara;

    public void goToSpringExhibition () {
        Optional<Cat> bride = exhibitionService.findBride(mara);
        if(bride.isPresent()) {
            Cat cat = bride.get();
            cat.sayHello();
        } else {
            //nothing happens
        }



    }
}
