package ru.prudei.cat.exhibition.validator;

import ru.prudei.cat.exhibition.model.Cat;

public class OrientalValidator implements CatValidator {
    @Override
    public boolean tryCertify(Cat cat) {
        return "Nya".equals(cat.getGreeting());
    }
}
