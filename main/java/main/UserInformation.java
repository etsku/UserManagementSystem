package main.userInfo;

import java.util.Scanner;

public class UserInformation {
    Scanner input = new Scanner(System.in);


    public void user_input() {
        while (true) {
            System.out.println("Enter your name: ");
            String name = input.nextLine();

            System.out.println("Enter your department: ");
            String department = input.nextLine();

            System.out.println("Enter your position: ");
            String position = input.nextLine();

            System.out.println("Do you want to add another person: Y/N");
            String argument = input.nextLine();
            if (argument.equals("N")) {
                System.out.println("Your information: " + name + ", " + department + ", " + position);
                System.out.println("Exiting program...");
                break;
                // CREATE TIMESTAMP FOR QUERYING
            }

        }
    }
}

