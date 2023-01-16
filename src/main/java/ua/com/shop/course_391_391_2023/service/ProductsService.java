package ua.com.shop.course_391_391_2023.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.shop.course_391_391_2023.entity.Category;
import ua.com.shop.course_391_391_2023.entity.Product;
import ua.com.shop.course_391_391_2023.repository.ProductRepository;

import java.util.List;

@Component
public class ProductsService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductsService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> getProductsFromCategory(Category category) {
        return productRepository.findAllByCategories(category);
    }

}
