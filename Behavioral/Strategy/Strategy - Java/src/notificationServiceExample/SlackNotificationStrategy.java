package notificationServiceExample;

public class SlackNotificationStrategy implements NotificationStrategy{

    @Override
    public void send(User user, String message) {
        System.out.println("Send notification to user: " + user.getUserName());
    }
}
