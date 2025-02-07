import java.io.Console;
import java.util.Scanner;

public  class Loginsystem.java {

    public static void main(String[] args) {
        String correctUsername = "Ezra";
        String correctPassword = "Ondieki";
        int maxAttempts = 3;
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available. Running in non-interactive mode. Password will not be masked.");
            Scanner scanner = new Scanner(System.in);

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Login successful!");
                    return;
                } else {
                    System.out.println("Login failed. Incorrect username or password.");
                    System.out.println("Attempts remaining: " + (maxAttempts - attempt));
                }
            }

            System.out.println("Too many incorrect attempts. Account locked.");
            scanner.close();
        } else {
            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Enter username: ");
                String username = console.readLine();

                char[] passwordArray = console.readPassword("Enter password: ");
                String password = new String(passwordArray);

                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Login successful!");
                    return;
                } else {
                    System.out.println("Login failed. Incorrect username or password.");
                    System.out.println("Attempts remaining: " + (maxAttempts - attempt));
                }
            }

            System.out.println("Too many incorrect attempts. Account locked.");
        }
    }
}
