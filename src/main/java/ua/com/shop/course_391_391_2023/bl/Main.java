package ua.com.shop.course_391_391_2023.bl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Vasya");
        names.add("Ivanna");
        names.add("sada");


        for (String name : names) {
            System.out.println(name);
        }


        names.add(1,"sadas");

        for (String name : names) {
            System.out.println(name);
        }

        names.remove(1);


        names.clear();







    }

}
