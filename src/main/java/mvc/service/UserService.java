package mvc.service;

import mvc.model.User;
import java.util.List;

public interface UserService {

    void addUser(User user);

    void editUser(User user);

    void deleteUser(long id);

    User getUserById(Long id);

    List<User> listUsers();
}