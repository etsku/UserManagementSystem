package main.userInfo;

import java.util.Scanner;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


public class  UserInformation {
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
                SimpleDateFormat datestamp = new SimpleDateFormat("dd/MM/yyyy.HH:mm:ss");
                String timestamp = datestamp.format(new Date());
                System.out.println("Your information: " + name + ", " + department + ", " + position + ", " + timestamp);
                System.out.println("Exiting program...");
                break;
                // CREATE TIMESTAMP FOR QUERYING
            }

        }
    }
}

