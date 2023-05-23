package main.FileCreator;

import java.Paths.FolderPaths;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;


// GIT PULL FIRST TO GET PREVIOUS CHANGES FROM GITHUB, OTHERWISE GIT MIGHT HAVE PROBLEMS WHEN PUSHING TO REPOSITORY
//THINK LATER HOW FILE HANDLING SHOULD BE DONE AND STATIC VARIABLE TO HOLD COUNT ON USERS ( Static belong to class, so object
// is not needed to access it

public class File_Handling implements FolderPaths {

        //DIRECTORY CREATION
        void Create_directories(){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date;
            try{
                date = dateFormat.parse(" ");
            } catch (Exception e){
                System.out.println(" Not able to parse year from timestamp");
                return;
            }
            File ParentDirectory = new File(FILE_LOCATION);
            if(!ParentDirectory.exists()){
                ParentDirectory.mkdir();
            }
            Calendar parse_timestamp = Calendar.getInstance();
            parse_timestamp.setTime(date);
        }







        // limit file size
        // inputs need to separated to by month so inputs will be assigned to right files
        // maybe timestamp -> pattern search -> correct folder

    void create_new_file() throws IOException {
        File monthly_file = new File();
    }


    // new files folder location part
        void Assign_files () {
            Path file_path = Path.of(FILE_LOCATION);
            File new_file = new File(" " + ".csv");
            if (new_file.createNewFile()) {
                System.out.println("New file is created in DataFiles directory ");
            } else System.out.println("Filename already exist");
            boolean created = new_file.createNewFile();


        }




    // How to give folder location in java

}





