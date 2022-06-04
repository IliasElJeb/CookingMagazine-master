package be.intecbrussel.model;

import java.util.ArrayList;
import java.util.List;

public class CookingMagazine implements RecipeImpl {

    private int id;
    private String name;
    private List<Recipe> recepies;

    public CookingMagazine(int id, String name, List<Recipe> recepies) {
        this.id = id;
        this.name = name;
        this.recepies = recepies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CookingMagazine(String name, List<Recipe> recepies) {
        this.name = name;
        this.recepies = recepies;
    }

    public CookingMagazine(String name) {
        this.name = name;
        this.recepies = new ArrayList<>();
    }

    @Override
    public void addRecipe(Recipe recipe) {
        recepies.add(recipe);
    }

    @Override
    public Recipe getRecipeByIndex(int index) {
        return recepies.get(index);
    }

    @Override
    public void removeRecipe(Recipe recipe) {
        recepies.remove(recipe);
    }

    @Override
    public void updateRecipe(int index, Recipe recipe) {
        recepies.set(index, recipe);
    }

    @Override
    public String toString() {
        return "CookingMagazine{" +
                "name='" + name + '\'' +
                ", recepies=" + recepies +
                '}';
    }
}
