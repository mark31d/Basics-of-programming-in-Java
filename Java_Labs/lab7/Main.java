package lab7;

public class Main {
    public static void main(String[] args) {
        ProductSearchService service = new ProductSearchService();

        Product laptop = new Product("Laptop", 1000);
        Product phone = new Product("Phone", 500);

        OnlineStore store1 = new OnlineStore("TechWorld");
        store1.addProduct(laptop, 950);
        store1.addProduct(phone, 450);

        OnlineStore store2 = new OnlineStore("GadgetStore");
        store2.addProduct(laptop, 1000);
        store2.addProduct(phone, 400);

        OnlineStore store3 = new OnlineStore("ElectroShop");
        store3.addProduct(laptop, 950);
        store3.addProduct(phone, 480);

        service.addStore(store1);
        service.addStore(store2);
        service.addStore(store3);

        System.out.println("Min price for Laptop: " + service.findMinPrice("Laptop"));
        System.out.println("Stores with min price for Laptop: " + service.findStoresWithMinPrice("Laptop"));
        System.out.println("Stores where all products are cheaper than recommended: " +
                service.findStoresAllCheaperThanRecommended());
    }
}
