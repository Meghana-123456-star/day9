
import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            if (password.trim().isEmpty()) {
                throw new IllegalArgumentException(
                    "Password cannot be empty."
                );
            }

            if (password.length() < 8) {
                throw new IllegalArgumentException(
                    "Password must contain at least 8 characters."
                );
            }

            System.out.println("Password validation successful.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
