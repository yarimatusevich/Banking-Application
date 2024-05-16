import java.util.HashMap;

public class AccountManager {
    public static void createAccount(String id, String password, String name, String address, double initialDeposit) {
        Account newAccount = new Account(id, name, password, address, initialDeposit);
        // Storing new account
        AccountDataBase.storeAccount(newAccount);
    }

    public static void logIn(String id, String password) {
        Account current = AccountDataBase.getAccount(id);

        if (password.equals(current.getPassword())) {
            System.out.println("Welcome, " + current.getName() + "!");
        }
    }

    public static void deleteAccount(String id) {
        AccountDataBase.removeAccount(id);
    }

    public static void changeAddress(String newAddress) {

    }

    public static void changePassword(String newPassword) {

    }
}