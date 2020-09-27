package ru.prudei.cat.exhibition.validator;

import ru.prudei.cat.exhibition.model.Cat;

public class MainKoonValidator implements CatValidator {


    @Override
    public boolean tryCertify(Cat cat) {
        if (cat.getBreed()==null) {
            return false;
        }
        switch (cat.getBreed()) {
            case MAINE_KOON:
                return true;
            case ORIENTAL:
                return false;

        }
        return false;
    }
}
