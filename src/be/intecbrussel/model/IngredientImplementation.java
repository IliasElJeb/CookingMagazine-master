package be.intecbrussel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IngredientImplementation implements IngredientImpl {

    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public Ingredient getIngredientByIndex(int index) {
        Ingredient ingredient  = ingredients.stream().
                filter(r -> r.getId() == index).
                findAny().orElse(null);
        return ingredient;
    }

    @Override
    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    @Override
    public void updateIngredient(int index, Ingredient ingredient) {
        ingredients.set(index,ingredient);
    }
}
