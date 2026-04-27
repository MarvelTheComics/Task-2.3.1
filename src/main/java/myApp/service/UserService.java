package myApp.service;

import myApp.model.User;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface UserService {
    void add(User user);
    void delete(Integer id);
    void update(User user);
    List<User> getUsers();
    User getUserByID(Integer id);
}
