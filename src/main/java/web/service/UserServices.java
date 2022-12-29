package web.service;

import web.model.User;

import java.util.List;

public interface UserServices {
    List<User> getAllUser();

    void saveUser(User user);

    void removeUserById(long id);

    void updateUser(User updateUser);
}
