package ua.com.shop.course_391_391_2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.shop.course_391_391_2023.entity.Category;
import ua.com.shop.course_391_391_2023.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByCategories(Category category);


}
