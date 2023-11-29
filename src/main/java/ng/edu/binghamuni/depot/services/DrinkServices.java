package ng.edu.binghamuni.depot.services;

import ng.edu.binghamuni.depot.Domain.Drink;

import java.util.List;

public interface DrinkServices {
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrink();
    Drink updateDrink(Drink drink);
    void deleteDrink(long id);
}
