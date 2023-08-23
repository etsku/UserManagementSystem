package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Hibernate.Entities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class UserInfoEntityTest {

    // Accessibility, no null values
    private Hibernate.Entities test_entity;

    @BeforeEach
    public void setUpObject(){
        test_entity = new Entities();
    }
    @Test
    public void testSetName(){
        test_entity.setName("Jack");
        assertEquals("Jack",test_entity.getName());
    }
    @Test
    public void testSetDepartment(){
        test_entity.setDepartment("Finance");
        assertEquals("Finance", test_entity.getDepartment());
    }
    @Test
    public void testSetPosition(){
        test_entity.setPosition("CFO");
        assertEquals("CFO",test_entity.getPosition());
    }
    @Test
    public void testShowUserInfo(){
        test_entity.setName("Jack");
        test_entity.setDepartment("IT");
        test_entity.setPosition("Developer");
        String expectedOutput =  "Employee ID: " + test_entity.getEmployeeID() + " Employee name: " + test_entity.getName() +
                " Employee department: " + test_entity.getDepartment() +
                " Employee position: " + test_entity.getPosition() + " ";
        assertEquals(expectedOutput,test_entity.ShowUserInfo());

    }



}
