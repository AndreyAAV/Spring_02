package by.itclass.controllers;

import by.itclass.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//http://localhost:8080/trainig/main/authorization
//http://localhost:8080/trainig/authorization
@Controller
@RequestMapping("/main")
public class UserController {
    private UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/authorization")
    public String authorization() {
        return "authoriz";
    }

    @GetMapping("/registration")
    public String registration() {
        service.registration();
        return "regist";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/logout")
    public String logout() {
        return "logout";
    }
}
