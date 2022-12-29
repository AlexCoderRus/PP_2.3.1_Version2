package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServicesImp implements UserServices{

    private final UserDao udi;

    @Autowired
    public UserServicesImp(UserDao udi) {
        this.udi = udi;
    }

    @Override
    public List<User> getAllUser() {
        return udi.getAllUser();
    }

    @Override
    public void saveUser(User user) {
        udi.saveUser(user);
    }

    @Override
    public void removeUserById(long id) {
        udi.removeUserById(id);
    }

    @Override
    public void updateUser(User updateUser) {
        udi.updateUser(updateUser);
    }
}
