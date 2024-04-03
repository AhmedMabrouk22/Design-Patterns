public class Customer implements ISubscriber{

    private String name;
    
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notify(String message) {
        // Send using Email        
        NotificationServices emailService = new NotificationServices(new EmailNotificationService());
        emailService.send("EMAIL - Notify " + name + " about " + message);
        
        // Send using SMS
        // NotificationServices smsService = new NotificationServices(new SMSNotificationService());
        // smsService.send("SMS - Notify " + name + " about " + message);
    }
    
}
