public class Main {
    public static void main(String[] args) {
        OnlineMarketPlace marketPlace = new OnlineMarketPlace();

        Customer customer1 = new Customer("Ahmed");
        Customer customer2 = new Customer("Mabrouk");

        marketPlace.event.subscribe(EventType.NEW_OFFER, customer2);
        marketPlace.event.subscribe(EventType.NEW_PRODUCT, customer1);

        marketPlace.addProduct(new Product("Laptop", 1000));
        marketPlace.addOffer(new Offer("10% discount on laptops"));
        marketPlace.addProduct(new Product("Mobile", 500));
        marketPlace.event.unsubscribe(EventType.NEW_OFFER, customer2);
        marketPlace.addOffer(new Offer("5% discount on mobiles"));

    }
}