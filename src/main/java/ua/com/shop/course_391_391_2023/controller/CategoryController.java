package ua.com.shop.course_391_391_2023.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.aspectj.weaver.ast.ASTNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.shop.course_391_391_2023.entity.Category;
import ua.com.shop.course_391_391_2023.service.CategoryService;

import java.util.List;

@Controller
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/")
    public String getHome(Model model) {

//        String name = "Hello Student!!!!";

//        model.addAttribute("hello", name);

        List<Category> categoryList = categoryService.getAllCategory();

        model.addAttribute("listCategory", categoryList);

        return "allcategory";
    }

    @GetMapping("/delivery")
    public String getPageDelivery() {
        return "delivery";
    }

    @GetMapping("/payment")
    public String getPagePayment() {
        return "payment";
    }


    @GetMapping("/test")
    public String getTestPage(Model model){

        String name = "asdsad";

        model.addAttribute("test", name);


        return "test";
    }

}
