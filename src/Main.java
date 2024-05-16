import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<String, Account> accountDataBase = new HashMap<>();

    public static void main(String[] args) {
        test(accountDataBase);
    }

    private static void test(HashMap<String, Account> accountDataBase) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Welcome! Do you wish to create a new account (N)," +
                        " log into an existing account (L), or quit (Q)?"
        );

        while (scanner.hasNext()) {
            String input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "Q" -> {
                    System.out.println("Quitting...");
                    System.exit(0);
                }
                case "L" -> {
                    // log in
                }
                case "N" -> {
                    // Printing prompts and gathering responses
                    System.out.println("Create a user id");
                    String id = scanner.nextLine();

                    System.out.println("Create new password");
                    String password = scanner.nextLine();

                    System.out.println("Enter your full name");
                    String name = scanner.nextLine();

                    System.out.println("Enter your address");
                    String address = scanner.nextLine();

                    System.out.println("Enter amount of initial deposit");
                    double initialDeposit = scanner.nextDouble();

                    AccountManager.createAccount(id, password, name, address, initialDeposit);
                    System.out.println("Account successfully created");

                    Account current = accountDataBase.get(id);
                    System.out.println(current);
                }
                default -> System.out.println("Invalid input");
            }
        }
    }

}
