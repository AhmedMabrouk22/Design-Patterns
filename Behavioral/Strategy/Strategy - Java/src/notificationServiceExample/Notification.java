package notificationServiceExample;

public class Notification {
    private final NotificationStrategy notificationStrategy;

    public Notification(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void send(User user,String message) {
        notificationStrategy.send(user,message);
    }
}
