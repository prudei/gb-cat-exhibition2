package ru.prudei.cat.exhibition.service;

import ru.prudei.cat.exhibition.model.Cat;
import ru.prudei.cat.exhibition.repository.CatBrideRepository;
import ru.prudei.cat.exhibition.validator.CatValidator;
import ru.prudei.cat.exhibition.validator.MainKoonValidator;

import java.util.Optional;

public class ExhibitionService {

    private CatBrideRepository catBrideRepository;
    private CatValidator validator;


    public ExhibitionService(CatBrideRepository catBrideRepository, CatValidator  validator) {
        this.catBrideRepository = catBrideRepository;
        this.validator = validator;
    }

    public Optional<Cat> findBride (Cat cat) {

        if (cat.isCertified()) {
            return Optional.of(getBrite());
        } else {
            boolean isCertified = validator.tryCertify(cat);
            if (isCertified) {
                return Optional.of(getBrite());
            }
        }
        return Optional.empty();
    }

    private Cat getBrite() {
        return catBrideRepository.getBrite();
    }
}
