package by.itclass.model.repositories;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public boolean save() {
        System.out.println("Class 'UserService', method 'save()'");
        return true;
    }
}
