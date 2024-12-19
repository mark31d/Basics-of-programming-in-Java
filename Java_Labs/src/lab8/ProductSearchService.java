package lab8;

import java.util.*;

public class ProductSearchService {
    private Set<OnlineStore> stores;

    public ProductSearchService() {
        this.stores = new HashSet<>();
    }

    public void addStore(OnlineStore store) {
        stores.add(store);
    }

    public double findMinPrice(String productName, Map<Product, Double> productPrices) {
        return productPrices.entrySet().stream()
                .filter(entry -> entry.getKey().getName().equals(productName))
                .mapToDouble(Map.Entry::getValue)
                .min()
                .orElse(-1);
    }

    public Set<String> findStoresWithMinPrice(String productName, Map<Product, Double> productPrices) {
        double minPrice = findMinPrice(productName, productPrices);
        Set<String> storeNames = new HashSet<>();

        for (OnlineStore store : stores) {
            for (Product product : store.getProducts()) {
                if (product.getName().equals(productName) &&
                        productPrices.getOrDefault(product, Double.MAX_VALUE) == minPrice) {
                    storeNames.add(store.getName());
                }
            }
        }
        return storeNames;
    }

    public Map<String, Integer> getStoreProductCounts() {
        Map<String, Integer> storeProductCounts = new HashMap<>();
        for (OnlineStore store : stores) {
            storeProductCounts.put(store.getName(), store.getProducts().size());
        }
        return storeProductCounts;
    }
}
