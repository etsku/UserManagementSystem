package main.FileCreator;
import java.Paths.FolderPaths;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.Paths.FolderPaths.FILE_LOCATION;


protected class create_file implements FolderPaths {

    void create_new_file() throws IOException{
        Path file_path = Path.of(FILE_LOCATION);
        File new_file = new File(testFile.txt);
        boolean created = new_file.createNewFile();
        assertTrue(success);

    }



    // How to give folder location in java

}