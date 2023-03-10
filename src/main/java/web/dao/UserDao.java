package web.dao;
import web.entity.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void addUser(User user);

    User getSingleUserById(Long id);

    void update(User user);

    void delete(Long id);
    
    @Query()
    List<User> asdasd(Long id);

}

