public class AccountManager {
    public static void createAccount(String id, String password, String name, String address, double initialDeposit) {
        Account newAccount = new Account(id, password, name, address, initialDeposit);
        // Storing new account
        AccountDataBaseUtilities.storeAccount(newAccount);
    }

    public static void logIn(String id, String password) {
        Account current = AccountDataBaseUtilities.getAccount(id);

        if (password.equals(current.getPassword())) {
            System.out.println("Welcome, " + current.getName() + "!");
        }
    }

    public static void deleteAccount(String id) {
        AccountDataBaseUtilities.removeAccount(id);
    }

    public static void changeAddress(String newAddress) {

    }

    public static void changePassword(String newPassword) {

    }
}