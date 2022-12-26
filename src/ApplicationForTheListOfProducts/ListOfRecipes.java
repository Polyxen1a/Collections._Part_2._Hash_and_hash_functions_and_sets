package ApplicationForTheListOfProducts;

import java.util.Set;

public class ListOfRecipes {
    private Set<Recipe> recipes;

    public ListOfRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
    public void ListOfRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть!");
        }
        recipes.add(recipe);
    }

    public void remove(Recipe recipe) {
        recipes.remove(recipe);
    }
 }
