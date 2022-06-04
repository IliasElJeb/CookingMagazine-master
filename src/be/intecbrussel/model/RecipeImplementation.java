package be.intecbrussel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecipeImplementation implements RecipeImpl{

    private List<Recipe> recipes = new ArrayList<>();



    @Override
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    @Override
    public Recipe getRecipeByIndex(int index) {
        Recipe recipe  = recipes.stream().
                filter(r -> r.getId() == index).
                findAny().orElse(null);
        return recipe;
    }

    @Override
    public void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }

    @Override
    public void updateRecipe(int index, Recipe recipe) {

        recipes.set(index,recipe);
    }


    public void sortOnName(){
    recipes.stream().sorted().collect(Collectors.toList());

    }
}