package ua.com.shop.course_391_391_2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.course_391_391_2023.entity.Clients;
import ua.com.shop.course_391_391_2023.entity.Users;

import java.util.List;

public interface ClientRepository extends JpaRepository<Clients, Long> {


    List<Clients> findAllByLastName(String name);

    Clients findByFirstNameAndLastName(String name1,String name2);

    Clients findByUser(Users users);
}
