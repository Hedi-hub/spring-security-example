package springsecurityexample.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springsecurityexample.demo.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public User findUserByUsername(String userName);
}
