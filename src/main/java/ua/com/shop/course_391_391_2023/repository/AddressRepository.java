package ua.com.shop.course_391_391_2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.course_391_391_2023.entity.Address;
import ua.com.shop.course_391_391_2023.entity.Clients;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAllByClientts(Clients clients);
}
