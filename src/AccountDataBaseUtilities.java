public class AccountDataBaseUtilities {

    public static void storeAccount(Account newAccount) {
        Main.accountDataBase.put(newAccount.getId(), newAccount);
    }

    public static void removeAccount(String id) {
        Main.accountDataBase.remove(id);
    }

    public static Account getAccount(String id) {
        return Main.accountDataBase.get(id);
    }
}
