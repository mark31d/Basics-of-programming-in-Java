package lab7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ProductSearchService {
    private List<OnlineStore> stores;

    public ProductSearchService() {
        this.stores = new ArrayList<>();
    }

    public void addStore(OnlineStore store) {
        stores.add(store);
    }

    public double findMinPrice(String productName) {
        double minPrice = Double.MAX_VALUE;
        for (OnlineStore store : stores) {
            for (Map.Entry<Product, Double> entry : store.getProducts().entrySet()) {
                if (entry.getKey().getName().equals(productName)) {
                    minPrice = Math.min(minPrice, entry.getValue());
                }
            }
        }
        return minPrice == Double.MAX_VALUE ? -1 : minPrice;
    }

    public List<String> findStoresWithMinPrice(String productName) {
        double minPrice = findMinPrice(productName);
        List<String> storeNames = new ArrayList<>();
        Iterator<OnlineStore> iterator = stores.iterator();

        while (iterator.hasNext()) {
            OnlineStore store = iterator.next();
            for (Map.Entry<Product, Double> entry : store.getProducts().entrySet()) {
                if (entry.getKey().getName().equals(productName) && entry.getValue() == minPrice) {
                    storeNames.add(store.getName());
                }
            }
        }
        return storeNames;
    }

    public List<String> findStoresAllCheaperThanRecommended() {
        List<String> storeNames = new ArrayList<>();
        for (OnlineStore store : stores) {
            boolean allCheaper = true;
            for (Map.Entry<Product, Double> entry : store.getProducts().entrySet()) {
                if (entry.getValue() >= entry.getKey().getRecommendedPrice()) {
                    allCheaper = false;
                    break;
                }
            }
            if (allCheaper) {
                storeNames.add(store.getName());
            }
        }
        return storeNames;
    }
}
