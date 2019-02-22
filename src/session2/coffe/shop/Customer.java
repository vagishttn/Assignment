package session2.coffe.shop;

public class Customer {

    private String name;
    private long phoneNumber;

    public Customer(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void waitForToken() {
        System.out.println("Customer Waits For Token");
    }
    public void collectCofee()
    {
        System.out.println("Customer Collect Coffe");
    }
}
