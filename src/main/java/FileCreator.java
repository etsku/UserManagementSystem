package main.FileCreator;
import java.Paths.FolderPaths;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.Paths.FolderPaths.FILE_LOCATION;

// GIT PULL FIRST TO GET PREVIOUS CHANGES FROM GITHUB, OTHERWISE GIT MIGHT HAVE PROBLEMS WHEN PUSHING TO REPOSITORY
protected class create_file implements FolderPaths {

    void create_new_file() throws IOException{

        // limit file size
        // inputs need to separated to by month so inputs will be assigned to right files
        // maybe timestamp -> pattern search -> correct folder


        // Create object to ask file name
        Scanner file_name = new Scanner(System.in);
        System.out.print("Enter new filename: ");
        String filename = file_name.nextLine();
        file_name.close();

        // new files folder location part
        Path file_path = Path.of(FILE_LOCATION);
        File new_file = new File(filename+".csv");
        if(new_file.createNewFile()){
            System.out.println("New file is created in DataFiles directory ");
        } else System.out.println("Filename already exist");
        boolean created = new_file.createNewFile();



    }



    // How to give folder location in java

}
