package Testing;

import static org.junit.jupiter.api.Assertions.*;

import UserManagementApplication.Hibernate.DatabaseOpener;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class SessionFactoryBuildTest {
    // PRIVATE METHODS DON'T NEED TO BE TESTED; WILL BE TESTED WHEN CALLING PUBLIC METHODS
    // Examine how debugger works in intellij
    // Void-keyword can be used to update or set object current values ( internal state), but not returning object state
    @Test
    // Test for getting SessionFactory
    public void testToGetFactory(){
        // Reason to use static is that we can call functions using class name (see below)
        SessionFactory sessionFactory = DatabaseOpener.getSessionFactory();
        assertNotNull(sessionFactory);
    }
    @Test
    // Test for closing SessionFactory
    /*public void testToShutdownFactory(){
        SessionFactory sessionFactory = DatabaseOpener.getSessionFactory();
        DatabaseOpener.shutdown();
        // Test that sessionFactory is closed
        assertTrue(sessionFactory.isClosed());
        assertNull(sessionFactory);*/





    }
    @AfterAll
    // Perform clean up after tests
    public static void Clean(){}

}
