package ru.prudei.cat.exhibition.validator;

import ru.prudei.cat.exhibition.model.Cat;

public interface CatValidator {
    boolean tryCertify(Cat cat);
}
