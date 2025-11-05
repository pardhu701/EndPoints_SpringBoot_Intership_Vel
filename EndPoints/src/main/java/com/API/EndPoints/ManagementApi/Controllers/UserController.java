package com.API.EndPoints.ManagementApi.Controllers;
import com.API.EndPoints.ManagementApi.DTO.UserDTO;
import com.API.EndPoints.ManagementApi.Entity.UserEntity;
import com.API.EndPoints.ManagementApi.Repository.UserRepository;
import com.API.EndPoints.ManagementApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/users/name")
    public UserEntity getUserByName(@RequestParam String name) {
        return userRepository.findByName(name);
    }

    @GetMapping("/users/id")
    public Optional<UserEntity> getUserById(@RequestParam String id) {
        return userRepository.findById(id);
    }

    @PostMapping("/users")
    public UserEntity createUser(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO);
        return userService.PostUserService(userDTO);

    }



}
