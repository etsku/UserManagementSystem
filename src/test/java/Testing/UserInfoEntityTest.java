package Testing;

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



}
