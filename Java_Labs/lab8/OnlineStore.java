package lab8;

import java.util.HashSet;
import java.util.Set;

public class OnlineStore {
    private String name;
    private Set<Product> products;

    public OnlineStore(String name) {
        this.name = name;
        this.products = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Set<Product> getProducts() {
        return products;
    }
}