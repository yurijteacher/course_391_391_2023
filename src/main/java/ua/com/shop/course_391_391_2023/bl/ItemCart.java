package ua.com.shop.course_391_391_2023.bl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.com.shop.course_391_391_2023.entity.Product;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ItemCart {

    private Product product;
    private int quantity;

}
