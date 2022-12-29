package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();

    void saveUser(User user);

    void removeUserById(long id);

    void updateUser(User updateUser);

}
