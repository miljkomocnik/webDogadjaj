package rs.edu.kpu.prijavaDogadjajaKPU2019.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.edu.kpu.prijavaDogadjajaKPU2019.model.User;
import rs.edu.kpu.prijavaDogadjajaKPU2019.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    Iterable<User> getAll(){
        return userRepository.findAll();
    }
}
