class EmailNotificationService implements INotificationService {
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}