class SMSNotificationService implements INotificationService {
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}