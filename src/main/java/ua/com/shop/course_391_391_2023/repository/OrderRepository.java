package ua.com.shop.course_391_391_2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.course_391_391_2023.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
