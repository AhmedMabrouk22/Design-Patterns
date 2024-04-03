package notificationServiceExample;

public class SMSNotificationStrategy implements NotificationStrategy{
    @Override
    public void send(User user, String message) {
        System.out.println("Send notification to user: " + user.getPhoneNumber());
    }

}
