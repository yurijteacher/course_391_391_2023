package ua.com.shop.course_391_391_2023.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.shop.course_391_391_2023.bl.Cart;
import ua.com.shop.course_391_391_2023.bl.ItemCart;
import ua.com.shop.course_391_391_2023.entity.*;
import ua.com.shop.course_391_391_2023.repository.ProductHasOrderRepository;
import ua.com.shop.course_391_391_2023.service.AddressService;
import ua.com.shop.course_391_391_2023.service.OrderService;
import ua.com.shop.course_391_391_2023.service.UsersService;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    private final UsersService userService;
    private final OrderService orderService;

    private final AddressService addressService;

    private final ProductHasOrderRepository productHasOrderRepository;

    public UserController(UsersService userService, OrderService orderService, AddressService addressService, ProductHasOrderRepository productHasOrderRepository) {
        this.userService = userService;
        this.orderService = orderService;
        this.addressService = addressService;
        this.productHasOrderRepository = productHasOrderRepository;
    }


    @GetMapping("/login")
    public String getPageLogin(){
        return "login";
    }


    @PostMapping("/login")
    public String getPageByUsernameAndPassword(@RequestParam(name = "username") String username,
                                               @RequestParam(name = "password") String password,
                                               HttpServletRequest request){


        if(userService.getLogicByUser(username,password)){
            HttpSession session = request.getSession();
            Users  user = userService.getUserByUsernameAndPass(username,password);

            session.setAttribute("user", user);

         return "redirect:/order";
        } else {
            return "redirect:/registration";
        }
    }



    @GetMapping("/order")
    public String getPageOrder(Model model,
                               HttpServletRequest request){

        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        if(cart == null) return "redirect:/";

        Users user  = (Users) session.getAttribute("user");
        if (user ==null) return "redirect:/login";

        Clients client = userService.getClientByUser(user);
        List<Address> address = addressService.getListAddress(client);

        model.addAttribute("itemsCart", cart.getCart());
        model.addAttribute("value", cart.getTotalValue());
        model.addAttribute("client", client);
        model.addAttribute("address", address.get(0));

        return "order";
    }


    @PostMapping("/buy")
    public String getPageThank(HttpServletRequest request,
                               @RequestParam(name = "delivery") String delivery1,
                               @RequestParam(name = "payment") String payment1){

        HttpSession session = request.getSession();


        Users user  = (Users) session.getAttribute("user");

        Clients client = userService.getClientByUser(user);

        Order order = new Order();

        order.setStatus(false);
        order.setDate_created(new Date());
        order.setClientes(client);
        order.setPayment(payment1);
        order.setDelivery(delivery1);

        Order order1 = orderService.saveOrderToDB(order); // +id

        Cart cart = (Cart) session.getAttribute("cart");

        for (ItemCart el : cart.getCart()) {
            productHasOrderRepository.save(new ProductHasOrder(el.getProduct(), el.getQuantity(), order1));
        }


        return "redirect:/thank";
    }

    @GetMapping("/thank")
    public String getPageThank(){
        return "thank";
    }








}
