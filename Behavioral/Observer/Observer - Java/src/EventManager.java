import java.util.*;


public class EventManager {

    private Map<EventType, List<ISubscriber>> subscribers;

    public EventManager() {
        subscribers = new HashMap<>();
        initSubscribers();
    }

    private void initSubscribers() {
        subscribers.put(EventType.NEW_OFFER, new ArrayList<>());
        subscribers.put(EventType.NEW_PRODUCT, new ArrayList<>());
    }

    public void subscribe(EventType type, ISubscriber subscriber) {
        subscribers.get(type).add(subscriber);
    }

    public void unsubscribe(EventType type, ISubscriber subscriber) {
        subscribers.get(type).remove(subscriber);
    }

    public void notifySubscribers(EventType type, String message) {
        subscribers.get(type).forEach(subscriber -> subscriber.notify(message));
    }

}
