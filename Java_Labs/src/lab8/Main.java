package lab8;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProductSearchService service = new ProductSearchService();

        Product laptop = new Product("Laptop", 1000);
        Product phone = new Product("Phone", 500);

        OnlineStore store1 = new OnlineStore("TechWorld");
        store1.addProduct(laptop);
        store1.addProduct(phone);

        OnlineStore store2 = new OnlineStore("GadgetStore");
        store2.addProduct(laptop);

        OnlineStore store3 = new OnlineStore("ElectroShop");
        store3.addProduct(phone);

        service.addStore(store1);
        service.addStore(store2);
        service.addStore(store3);

        Map<Product, Double> productPrices = new HashMap<>();
        productPrices.put(laptop, 950.0);
        productPrices.put(phone, 450.0);

        System.out.println("Min price for Laptop: " + service.findMinPrice("Laptop", productPrices));
        System.out.println("Stores with min price for Laptop: " + service.findStoresWithMinPrice("Laptop", productPrices));
        System.out.println("Product counts in stores: " + service.getStoreProductCounts());
    }
}
