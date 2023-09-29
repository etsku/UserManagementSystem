package UserManagementApplication.Hibernate;
import UserManagementApplication.Hibernate.EmployeeEntities;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

//  Greate new branch based on master branch to start develop this feature
// Read about Spring Data JPA for this section
// Repository is for data fetching operations
// Also create service and controller to interact with repository (maybe using Spring)
@Repository
// Long can be replaced to other data types, primary key indicates what type should be used
public interface UserDataRep extends JpaRepository<EmployeeEntities,Integer> {
    // JpaRepository gives more options for querying
    // Add additional queries if needed, basic queries come from JpaRepository




}
