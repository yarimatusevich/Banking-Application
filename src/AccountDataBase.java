import java.util.HashMap;
public class AccountDataBase {

    private static HashMap<String, Account> accountDataBase;

    public static void storeAccount(Account newAccount) {
        accountDataBase.put(newAccount.getId(), newAccount);
    }

    public static void removeAccount(String id) {
        accountDataBase.remove(id);
    }
}
