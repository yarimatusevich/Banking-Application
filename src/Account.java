public class Account {
    private final String id;
    private final String name;
    private String address;
    private String password;
    private double balance;

    Account(String id, String name, String address, String password, double balance) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.password = password;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return name + ", " + address + ", " + balance;
    }
}
