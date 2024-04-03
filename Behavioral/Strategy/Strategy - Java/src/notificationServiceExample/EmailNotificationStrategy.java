package notificationServiceExample;

public class EmailNotificationStrategy implements NotificationStrategy{
    @Override
    public void send(User user, String message) {
        System.out.println("Send notification to user: " + user.getEmail());
    }
}
