package com.API.EndPoints.ManagementApi.Repository;

import com.API.EndPoints.ManagementApi.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Long> {

//    OrderEntity findBUser(String userid);
}
