package Testing;



import UserManagementApplication.Hibernate.EmployeeEntities;

import static  org.junit.jupiter.api.Assertions.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import javax.transaction.Transactional;



public class UserInfoEntityTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @BeforeEach
    public void setUp(){
        // Get configuration information from hibernate.cfg.xml file
        Configuration conf = new Configuration().configure("hibernate.cfg.xml");
        // Build sessionfactory
        sessionFactory = conf.buildSessionFactory();

        // Open session and transaction
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    @AfterEach
    public void ShutDown(){
        transaction.commit();
        session.close();
    }

    @Test
    public void testEntities(){
        EmployeeEntities person = new EmployeeEntities();
        person.setName("Tim");
        person.setPosition("Analyst");
        person.setDepartment("Finance");
        session.save(person);

        // Test if ID is greater than 0
        assertTrue(person.getEmployeeID()>0);

        EmployeeEntities fetchPerson = session.get(EmployeeEntities.class,person.getEmployeeID());
        assertNotNull(fetchPerson);
        assertEquals("Tim",fetchPerson.getName());
        assertEquals("Analyst",fetchPerson.getPosition());
        assertEquals("Finance",fetchPerson.getDepartment());

    }

}
