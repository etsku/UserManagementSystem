package main.userInfo;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


// MULTIMAP FOR STORING INPUTS
public class  UserInformation {
    static Scanner input = new Scanner(System.in);
    private String name;
    private String department;
    private String position;

    public void setName (String name){
        this.name = name;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setPosition(String position){
        this.position = position;
    }

    // Getter methods
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }


    // Refactor to use set and get methods, because inputs are now inside function
    public static void user_input() {
            // Setter methods


        // Create object to access setter and getter methods
        UserInformation accessor = new UserInformation();


        while (true) {
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            accessor.setName(name);

            System.out.println("Enter your department: ");
            String department = input.nextLine();
            accessor.setDepartment(department);

            System.out.println("Enter your position: ");
            String position = input.nextLine();
            accessor.setPosition(position);

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
    String key = getName();

    // Add values to key
    List<String> keyValues = new ArrayList<>();



}

