package ru.yunev.springboot.Project2Boot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.yunev.springboot.Project2Boot.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {

        entityManager.persist(user);

    }

    @Override
    public void updateUser(User user) {

        entityManager.merge(user);
    }

    @Override
    public void removeUser(int id) {

        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public User getUserById(int id) {
       return entityManager.find(User.class, id);

    }

    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }
}
