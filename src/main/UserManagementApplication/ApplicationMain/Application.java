package UserManagementApplication.ApplicationMain;

import main.config.DBconf;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

// USE HIBERNATE FOR DATA STORING

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
       

        DBconf db_conn = new DBconf();
        db_conn.connect();
        



        // USE GIT STATUS TO CHECK WHERE YOU LEFT PREVIOUSLY IN GIT
    }
}
















