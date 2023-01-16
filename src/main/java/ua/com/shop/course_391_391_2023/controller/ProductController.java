package ua.com.shop.course_391_391_2023.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.shop.course_391_391_2023.bl.Cart;
import ua.com.shop.course_391_391_2023.entity.Category;
import ua.com.shop.course_391_391_2023.entity.Product;
import ua.com.shop.course_391_391_2023.service.ProductsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    private final ProductsService productsService;

    @Autowired
    public ProductController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/category/{id}")
    public String getPagesProductsFromCategory(@PathVariable("id") Category category, Model model) {

        List<Product> products = new ArrayList<>();
        products = productsService.getProductsFromCategory(category);


        model.addAttribute("allProductByCategory", products);

        return "productsByCategory";
    }


    @PostMapping("/addNewProductToCart")
    public String saveNewProductToCart(@RequestParam(name = "id") Product product,
                                       @RequestParam(name = "quantity") int quantity,
                                       HttpServletRequest request
                                       ){

     HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("cart");
        // session.setAttribute("cart", cart);

        if(cart==null){
            cart = new Cart();
        }

        cart.addNewItemCart(product, quantity);

        session.setAttribute("cart", cart);

        return "redirect:/cart";
    }


    @GetMapping("/cart")
    public String getPageCart(HttpServletRequest request,
                              Model model){

        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("cart");

        if(cart ==null) cart = new Cart();

        model.addAttribute("itemsCart", cart.getCart());
        model.addAttribute("total", cart.getSumItems());
        model.addAttribute("value", cart.getValue());

        return "cart";
    }


    @PostMapping("/updateProductFromCart")
    public String updateProductFromCart(HttpServletRequest request,
                                        @RequestParam(name = "id") Product product,
                                        @RequestParam(name = "quantity") int quantity){

        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");

        if(cart==null){
            cart = new Cart();
        }

        cart.updateItemCart(product, quantity);
        session.setAttribute("cart", cart);

        return "redirect:/cart";
    }


    @PostMapping("/deleteItemCart")
    public String deleteItemCart(HttpServletRequest request,
                                 @RequestParam(name = "id") Product product){

        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");

        if(cart==null){
            cart = new Cart();
        }

        cart.deleteItemFromCart(product);
        session.setAttribute("cart", cart);

        return "redirect:/cart";
    }


    @PostMapping("/deleteAllItem")
    public String deleteAllItem(HttpServletRequest request){

        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");

        if(cart==null){
            cart = new Cart();
        }

        cart.deleteAllItemsCart();
        session.setAttribute("cart",cart);

        return "redirect:/cart";
    }



}
