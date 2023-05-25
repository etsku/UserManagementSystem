package main.userInfo;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Scanner;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


// MULTIMAP FOR STORING INPUTS
public class  UserInformation {
    Scanner input = new Scanner(System.in);

// Refactor to use set and get methods, because inputs are now inside function
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

class MultimappingInputs extends UserInformation{
    Multimap <String,String> inputs_map = ArrayListMultimap.create();



}

