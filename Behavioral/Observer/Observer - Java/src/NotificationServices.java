class NotificationServices {
    
    private INotificationService serviceProvider;
    
    public NotificationServices(INotificationService serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
    
    public void send(String message) {
        serviceProvider.send(message);
    }
}