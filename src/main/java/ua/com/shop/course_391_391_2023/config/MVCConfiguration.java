package ua.com.shop.course_391_391_2023.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVCConfiguration implements WebMvcConfigurer {

    public void addResourceHandlers(ResourceHandlerRegistry reg) {
    reg.
            addResourceHandler("/static/**").
            addResourceLocations("classpath:/static/");
    }

}


