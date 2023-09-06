package UserManagementApplication.Hibernate;
import Hibernate.EmployeeEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//  Greate new branch based on master branch to start develop this feature
@Repository
// Long can be replaced to other data types, primary key indicates what type should be used
public interface userDataRep extends CrudRepository<EmployeeEntities,Integer>{



}
