package by.itclass.model.services;

import by.itclass.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void registration() {
        System.out.println("Class 'UserService', method 'registration()'");

    }

}
