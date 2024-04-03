package notificationServiceExample;

public interface NotificationStrategy {
    void send(User user, String message);
}
