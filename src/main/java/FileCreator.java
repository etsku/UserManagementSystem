package main.FileCreator;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



protected class create_file implements FILE_FOLDERS {

    void create_new_file() throws IOException{
        Path file_path = Path.of(FILE_LOCATION);
        File new_file = new File(testFile.txt);
        boolean created = new_file.createNewFile();
        assertTrue(success);

    }



    // How to give folder location in java

}
