package com.API.EndPoints.ManagementApi.Repository;

import com.API.EndPoints.ManagementApi.Entity.UserEntity;
import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {
    UserEntity findByName(String name);

}
