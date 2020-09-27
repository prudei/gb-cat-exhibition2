package ru.prudei.cat.exhibition.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.prudei.cat.exhibition.model.Breed;
import ru.prudei.cat.exhibition.model.Cat;
import ru.prudei.cat.exhibition.validator.MainKoonValidator;

class MainKoonValidatorTest {

    @Test
    void positiveTryCertify() {

        Cat maine = new Cat();

        maine.setBreed(Breed.MAINE_KOON);

        MainKoonValidator validator = new MainKoonValidator();
        boolean actual = validator.tryCertify(maine);
        Assertions.assertTrue(actual);
    }

    @Test
    void negativeTryCertify() {

        Cat barsik = new Cat();

        barsik.setBreed(Breed.ORIENTAL);

        MainKoonValidator validator = new MainKoonValidator();
        boolean actual = validator.tryCertify(barsik);
        Assertions.assertFalse(actual);
    }

    @Test
    void noBreedTryCertify() {

        Cat barsik = new Cat();
        MainKoonValidator validator = new MainKoonValidator();
        boolean actual = validator.tryCertify(barsik);
        Assertions.assertFalse(actual);
    }
}