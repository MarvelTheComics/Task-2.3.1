package myApp.dao;

import myApp.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(Integer id);
    List<User> getUsers();
    void update(User user);
    User getUserByID(Integer id);
}
