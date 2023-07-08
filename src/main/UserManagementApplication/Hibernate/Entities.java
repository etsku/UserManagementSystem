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

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setDepartment(String Department){
        this.Department = Department;
    }
    public String getDepartment(){
        return Department;
    }
    public void setPosition(String Position){
        this.Position = Position;
    }
    public String getPosition(){
        return Position;
    }

    @Override
    public String ShowUserInfo(){
        return "Employee ID: " + EmployeeID + " Employee name: " + Name + " Employee department: " + Department +
        " Employee position: " + Position + " ";
    }

    }
