public class Main {

    public static void main(String[] args) {
        UserAccount newUser =
                new UserAccount(
                        "george24", "George King",
                        "42 Bank Ave, New York, NY", "password", 42.50
                );

        System.out.println(newUser);
    }
}
