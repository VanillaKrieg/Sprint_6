package ru.yandex.praktikum.animals;

import java.util.List;

public interface AnimalInterface {
    List<String> getFood(String animalKind) throws Exception;
}
