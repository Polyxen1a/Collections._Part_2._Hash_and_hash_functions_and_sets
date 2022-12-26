package ApplicationForTheListOfProducts;

import java.util.HashSet;
import java.util.Set;

public class ListOfProducts {
    private Set<Product> products;

    public void add(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже есть!");
        }
        product.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

}
