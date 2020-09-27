package ru.prudei.cat.exhibition.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.prudei.cat.exhibition.model.Breed;
import ru.prudei.cat.exhibition.model.Cat;
import ru.prudei.cat.exhibition.repository.CatBrideRepository;
import ru.prudei.cat.exhibition.validator.MainKoonValidator;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

class ExhibitionServiceTest {

    @Test
    void findBride() {
        ExhibitionService exhibitionService = prepareExhibition();
        Cat mara = new Cat();
        mara.setBreed(Breed.MAINE_KOON);

        Optional<Cat> bride = exhibitionService.findBride(mara);

        Assertions.assertTrue(bride.isPresent());
        Assertions.assertEquals(Breed.MAINE_KOON, bride.get().getBreed());


    }

    private ExhibitionService prepareExhibition() {
        MainKoonValidator validator = new MainKoonValidator();
        CatBrideRepository catBrideRepository = getCatBrideRepository();
        return new ExhibitionService(catBrideRepository, validator);
    }

    private CatBrideRepository getCatBrideRepository() {
        Cat luchick = new Cat();

        luchick.setBreed(Breed.MAINE_KOON);
        Set<Cat> brides = new HashSet<>();

        brides.add(luchick);


        return new CatBrideRepository(brides);
    }
}