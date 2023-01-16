package ua.com.shop.course_391_391_2023.service;

import org.springframework.stereotype.Service;
import ua.com.shop.course_391_391_2023.entity.Order;
import ua.com.shop.course_391_391_2023.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;


    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }



    public Order saveOrderToDB(Order order){
      return orderRepository.save(order);
    }
}
