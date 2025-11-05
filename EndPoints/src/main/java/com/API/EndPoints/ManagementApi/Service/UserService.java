package com.API.EndPoints.ManagementApi.Service;


import com.API.EndPoints.ManagementApi.DTO.UserDTO;
import com.API.EndPoints.ManagementApi.Entity.UserEntity;
import com.API.EndPoints.ManagementApi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public UserEntity PostUserService(UserDTO userDTO){
        UserEntity user=new UserEntity();
        System.out.println(userDTO.getUserid());
        user.setType(userDTO.getType());
        user.setAdminpasscode(userDTO.getAdminpasscode());
        user.setCreateadminpass(userDTO.getCreateadminpass());
        user.setId(userDTO.getUserid());
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());

        return userRepository.save(user);

    }



}
