package ru.yunev.springboot.Project2Boot.service;
import org.springframework.stereotype.Component;
import ru.yunev.springboot.Project2Boot.model.User;
import java.util.List;

@Component
public interface UserService {
    public void addUser(User user);
    public void updateUser(User user);
    public void removeUser(int id);
    public User getUserById(int id);
    public List<User> listUsers();
}
