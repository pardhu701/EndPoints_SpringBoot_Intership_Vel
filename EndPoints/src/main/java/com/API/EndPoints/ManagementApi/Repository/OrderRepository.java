package com.API.EndPoints.ManagementApi.Repository;

import com.API.EndPoints.ManagementApi.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
    void deleteByIdN(String idN);
    Optional<OrderEntity> findByIdN(String idN);

}
