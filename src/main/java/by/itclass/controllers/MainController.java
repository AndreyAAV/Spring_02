package by.itclass.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    //http://localhost:8080/test1/37645
    @RequestMapping("/test1/{id}")
    public String test1(@PathVariable("id") int id) {
        System.out.println("id:" + id);
        return "view";
    }

    //http://localhost:8080/test2?id=37645
    @RequestMapping("/test2")
    public String test2(@RequestParam("id") int id) {
        System.out.println("id:" + id);
        return "view";
    }

    @RequestMapping("/authorization")
    public String authorization(@RequestParam String login, @RequestParam String password) {
        System.out.println("login: " + login);
        System.out.println("password: " + password);
        return "authoriz";
    }

}
