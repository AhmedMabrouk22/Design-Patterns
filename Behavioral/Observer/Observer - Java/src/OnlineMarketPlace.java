import java.util.*;

public class OnlineMarketPlace {

    private List<Product> products;
    private List<Offer> offers;
    public EventManager event;

    public OnlineMarketPlace() {
        products = new ArrayList<>();
        offers = new ArrayList<>();
        event = new EventManager();
    }

    public void addProduct(Product product) {
        products.add(product);
        // notify all users about the new product
        event.notifySubscribers(EventType.NEW_PRODUCT, "New product added " + product.getName());

    }


    public void addOffer(Offer offer) {
        offers.add(offer);
        // notify all users about the new offer
        event.notifySubscribers(EventType.NEW_OFFER, "New offer added " + offer.getMessage());
    }


}
