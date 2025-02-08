package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void createUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

}
