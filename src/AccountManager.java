import javax.swing.*;

public class AccountManager {
    public static void createAccount(String id, String password, String name, String address, double initialDeposit) {
        Account newAccount = new Account(id, name, password, address, initialDeposit);
        // Storing new account
        AccountDataBase.storeAccount(newAccount);
    }

    public static void deleteAccount() {

    }

    public static void changeAddress(String newAddress) {

    }

    public static void changePassword(String newPassword) {

    }
}