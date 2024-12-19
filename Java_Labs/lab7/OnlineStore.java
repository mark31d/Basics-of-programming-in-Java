package lab7;

import java.util.HashMap;
import java.util.Map;

public class OnlineStore {
    private String name;
    private Map<Product, Double> products;

    public OnlineStore(String name) {
        this.name = name;
        this.products = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product, double price) {
        products.put(product, price);
    }

    public Map<Product, Double> getProducts() {
        return products;
    }
}
