package ApplicationForTheListOfProducts;

import java.util.Objects;

public class Recipe {
    private String name;
    private ListOfProducts listOfProducts;
    private int totalCost;

    public Recipe(String name, ListOfProducts listOfProducts, int totalCost) {
        setName(name);
        setListOfProducts(listOfProducts);
        setTotalCost(totalCost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListOfProducts getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(ListOfProducts listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
