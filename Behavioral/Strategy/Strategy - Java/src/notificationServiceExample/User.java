package notificationServiceExample;

public class User {
    private String email;
    private String phoneNumber;
    private String userName;
    public User(String email, String phoneNumber, String userName) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
