package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.dao.UserDaoJDBCImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl hibernate = new UserDaoJDBCImpl();
    public void createUsersTable() {
        hibernate.createUsersTable();
    }

    public void dropUsersTable() {
        hibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        hibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        hibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
         hibernate.getAllUsers();
        return null;
    }

    public void cleanUsersTable() {
        hibernate.cleanUsersTable();
    }
}
