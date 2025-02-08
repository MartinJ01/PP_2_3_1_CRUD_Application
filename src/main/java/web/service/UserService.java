package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    void createUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);
}
