package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public UserServiceImpl() {
        this.userDao = new UserDaoJDBCImpl();
    }

    @Override
    public void createUsersTable() {
        this.userDao.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        this.userDao.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        this.userDao.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        this.userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userDao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        this.userDao.cleanUsersTable();
    }
}