package rs.edu.kpu.prijavaDogadjajaKPU2019.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.edu.kpu.prijavaDogadjajaKPU2019.model.Role;
import rs.edu.kpu.prijavaDogadjajaKPU2019.repository.RoleRepository;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleRepository roleRepository;

    @GetMapping
    Iterable<Role> getAll(){
        return roleRepository.findAll();
    }
}
