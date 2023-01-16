package ua.com.shop.course_391_391_2023.bl;

import lombok.Getter;
import lombok.Setter;
import ua.com.shop.course_391_391_2023.entity.Product;

import java.util.ArrayList;
import java.util.List;

@Getter
//@Setter

public class Cart {

    List<ItemCart> cart;
    private int sumItemCart;
    private double totalValue;

    public Cart() {
        cart = new ArrayList<>();
        sumItemCart = 0;
        totalValue = 0;
    }

    public synchronized void addNewItemCart(Product product, int quantity) {

        boolean logic = true;

        for (ItemCart el : cart) {
            if (el.getProduct().getId() == product.getId()) {
                logic = false;
                el.setQuantity(el.getQuantity() + quantity);
            }
        }

        // v.1
        //        ItemCart itemCart = new ItemCart(product, quantity);
        //        if(logic) cart.add(itemCart);
        // v.2
        if (logic) cart.add(new ItemCart(product, quantity));

    }

    public synchronized void updateItemCart(Product product, int quantity) {
        if (quantity <= 0) {
            for (ItemCart el : cart) {
                if (product.getId() == el.getProduct().getId()) {
                    cart.remove(el);
                    break;
                }
            }
        }
        if (quantity > 0) {
            for (ItemCart el : cart) {
                if (product.getId() == el.getProduct().getId()) {
                    el.setQuantity(quantity);
                }
            }
        }
    }

    public synchronized void deleteItemFromCart(Product product) {
        for (ItemCart el : cart) {
            if (product.getId() == el.getProduct().getId()) {
                cart.remove(el);
                break;
            }
        }
    }

    public synchronized void deleteAllItemsCart() {
        cart.clear();
        sumItemCart = 0;
        totalValue = 0;

    }

    public synchronized int getSumItems() {

        sumItemCart = 0;

        for (ItemCart el : cart) {
            sumItemCart++;
        }

        return sumItemCart;
    }


    public synchronized double getValue() {
        totalValue = 0;
        for (ItemCart el : cart) {
            totalValue += el.getQuantity() * el.getProduct().getPrice().doubleValue();
        }
        return totalValue;
    }
}
