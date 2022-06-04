package be.intecbrussel.model;

import java.util.List;
import java.util.Objects;

public class Recipe implements IngredientImpl {

    private int id;
    private String name;
    private Author author;
    private String procedure;
    private List<Ingredient> ingredients;


    public Recipe(String name, Author author, String procedure, List<Ingredient> ingredients) {

        this.name = name;
        this.author = author;
        this.procedure = procedure;
        this.ingredients = ingredients;
    }


    public Recipe(int id, String name, Author author, String procedure, List<Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.procedure = procedure;
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id && name.equals(recipe.name) && author.equals(recipe.author) && procedure.equals(recipe.procedure) && ingredients.equals(recipe.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, procedure, ingredients);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;

    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public Ingredient getIngredientByIndex(int index) {
        return ingredients.get(index);
    }

    @Override
    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    @Override
    public void updateIngredient(int index, Ingredient ingredient) {
        ingredients.set(index, ingredient);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", procedure='" + procedure + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }


}
