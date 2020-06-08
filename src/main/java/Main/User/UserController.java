package Main.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/user")
    public List<User> getAllAccounts(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/user")
    public User addAccount(@RequestBody User user){
        userRepository.save(user);
        return user;
    }

}