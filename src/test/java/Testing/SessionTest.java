package Testing;

import UserManagementApplication.Hibernate.EmployeeEntities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import javax.transaction.Status;

import static org.junit.jupiter.api.Assertions.*;


// CHECK IF THERE ARE MODIFICATIONS TO BE DONE TO MAKE CODE WORK CORRECTLY (IT INSERT DATA!!!)
// AlSO CREATE THIS CODE TO BE TEST!
public class SessionTest{
    private SessionFactory sessionFactory;
    private Session session;

    @BeforeEach
    void SetUpFactory(){
        Configuration conf = new Configuration();
        conf.configure();
        sessionFactory = conf.buildSessionFactory();
        session = sessionFactory.openSession();
    }
    @AfterEach
    // Probably not necessary

    void session_state(){
        if(session != null && session.isOpen()){
            session.close();
        }
        if(sessionFactory != null && !sessionFactory.isClosed()){
            sessionFactory.close();
        }
    }
    @Test
    void TestOpenSession(){
        EmployeeEntities test_entitites = new EmployeeEntities();
        // Transaction to insert data into database
        Transaction T = session.beginTransaction();
        try {
            test_entitites.setName("Jack");
            test_entitites.setPosition("Software developer");
            test_entitites.setDepartment("IT");

            
            // Save uses EmployeeEntities object test_entities to save data added with object
            session.save(test_entitites);
            T.rollback();
            assertFalse(T.getStatus().canRollback());
        }
        catch (Exception err){
            if(T != null && T.isActive()){
                T.rollback();
            }

        }
        finally {
            if(session.isOpen()){
                System.out.println("Session is not closed");
                session.close();

            } else{
                System.out.println("Session is closed");

                }
            if (sessionFactory.isClosed()){
                System.out.println("SessionFactory is closed");

            } else{
                System.out.println("Sessionfactory is not closed");
                sessionFactory.close();
            }
            }

        }


    }





















