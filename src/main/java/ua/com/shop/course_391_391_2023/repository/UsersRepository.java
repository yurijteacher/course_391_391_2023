package ua.com.shop.course_391_391_2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.course_391_391_2023.entity.Users;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {
    List<Users> findAllByUsername(String name);
    List<Users> findAllByUsernameAndPassword(String username, String pass);
    Users findByUsername(String name);


    Users findByUsernameAndPassword(String username, String password);
}
