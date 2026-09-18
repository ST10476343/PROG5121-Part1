package prog5121poe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to QuickChat");

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Create Username: ");
        String username = input.nextLine();

        System.out.print("Create Password: ");
        String password = input.nextLine();

        System.out.print("Enter Cellphone (+27XXXXXXXXX): ");
        String phone = input.nextLine();

        Login login = new Login(firstName, lastName, username, password, phone);

        System.out.println(login.registerUser());

        System.out.println("LOGIN");

        System.out.print("Username: ");
        String loginUsername = input.nextLine();

        System.out.print("Password: ");
        String loginPassword = input.nextLine();

        System.out.println(login.returnLoginStatus(loginUsername, loginPassword));

        input.close();
    }
}