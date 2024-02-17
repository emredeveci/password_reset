import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, response, newPassword;
        Boolean loop = true;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your user name: ");
        userName = input.nextLine();

        System.out.print("Enter your password ");
        password = input.nextLine();

        /*
        if the user enters the correct username but the wrong password,
        the program gives the user a chance to reset their password
        */
        if (userName.equals("gamerlegend") && password.equals("iddqd")) {
            System.out.println("Login successful");
        } else if (userName.equals("gamerlegend") && !(password.equals("iddqd"))) {
            System.out.print("Your password doesn't match. Would you like to reset it? Please enter \"Yes\" or \"No\"");
            response = input.nextLine();

            if (response.equalsIgnoreCase("Yes")) {
                /* the program keeps asking the user for a new password
                until it receives one that doesn't match the old one
                 */
                while (loop) {
                    System.out.print("Please enter your new password: ");
                    newPassword = input.nextLine();
                    if (!("iddqd".equals(newPassword))) {
                        System.out.println("Your password has been changed.");
                        loop = false;
                    } else {
                        System.out.println("You have entered a previously used password.");
                    }
                }
            } else if (response.equalsIgnoreCase("No")) {
                System.out.print("Your login could not be completed.");
            }
        }
    }
}