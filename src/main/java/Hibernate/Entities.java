package Hibernate;

import javax.persistence.*;

@Entity(name="Personal")
@Table(name="EmployeeInformation")
public class Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EmployeeID;

    // ADD COLUMN SPECIFICATIONS
    @Column(name="Name", length = 25, nullable = false, unique = false)
    private String Name;

    @Column(name="Department", length = 25, nullable = false, unique = false)
    private String Department;

    @Column(name="Position", length = 25, nullable = false, unique = false)
    private String Position;
}
