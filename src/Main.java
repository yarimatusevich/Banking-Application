import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<String, Account> accountDataBase = new HashMap<>();

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Scanner scanner = new Scanner(System.in);

        String welcomeMessage =
                "Welcome! Do you wish to create a new account (N), log into an existing account (L), or quit (Q)?";

        System.out.println(
                welcomeMessage
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
                    System.out.println("Enter your user id");
                    String id = scanner.nextLine();

                    Account current = AccountDataBaseUtilities.getAccount(id);

                    // Checking if user with this id exists
                    if (current != null) {
                        System.out.println("Enter your password");
                        String password = scanner.nextLine();
                        String correctPassword = current.getPassword();

                        if (password.equals(correctPassword)) {
                            AccountManager.logIn(id, password);
                        } else {
                            System.out.println("Wrong password.");
                            System.out.println(welcomeMessage);
                        }

                    } else {
                        System.out.println("Invalid user id.");
                        System.out.println(welcomeMessage);
                    }
                }
                case "N" -> {
                    // Printing prompts and gathering responses
                    System.out.println("Create a user id");
                    String id = scanner.nextLine();

                    // Prompting for password
                    System.out.println("Create new password");
                    String password = scanner.nextLine();

                    // Prompting for user's full name
                    System.out.println("Enter your full name");
                    String name = scanner.nextLine();

                    // Prompting for user address
                    System.out.println("Enter your address");
                    String address = scanner.nextLine();

                    // Prompting users for initial deposit
                    System.out.println("Enter amount of initial deposit");
                    double initialDeposit = scanner.nextDouble();

                    // Creating account using info from responses
                    AccountManager.createAccount(id, password, name, address, initialDeposit);
                    System.out.println("Account successfully created");
                }
                default -> System.out.println("Invalid input");
            }
        }
    }

}
