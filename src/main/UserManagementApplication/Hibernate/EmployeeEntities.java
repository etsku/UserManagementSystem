package UserManagementApplication.Hibernate;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
// Private modifier restrict access outside off class -> reason for getter and setter methods
@Entity(name="Personal")
@Table(name="EmployeeInformation",schema = "UserManagementSystem")
public class EmployeeEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "index")
    @SequenceGenerator(name = "index", sequenceName = "generate_index",allocationSize = 1)

    private int EmployeeID;

    // ADD COLUMN SPECIFICATIONS
    @Column(name="Name", length = 25, nullable = false, unique = false)
    private String Name;

    @Column(name="Department", length = 25, nullable = false, unique = false)
    private String Department;

    @Column(name="Position", length = 25, nullable = false, unique = false)
    private String Position;

    /*public EmployeeEntities() {
    }*/

    public int getEmployeeID(){
        return  EmployeeID;
    }
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


    public String ShowUserInfo(){
        return "Employee ID: " + EmployeeID + " Employee name: " + Name + " Employee department: " + Department +
        " Employee position: " + Position + " ";
    }
    }


