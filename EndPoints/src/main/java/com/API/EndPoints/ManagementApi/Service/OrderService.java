package com.API.EndPoints.ManagementApi.Service;

import com.API.EndPoints.ManagementApi.DTO.OrderDTO;
import com.API.EndPoints.ManagementApi.DTO.OrderPutDTO;
import com.API.EndPoints.ManagementApi.Entity.OrderEntity;
import com.API.EndPoints.ManagementApi.Entity.UserEntity;
import com.API.EndPoints.ManagementApi.Repository.OrderRepository;
import com.API.EndPoints.ManagementApi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    public OrderEntity saveOrder(OrderDTO orderDTO) {
        UserEntity user = userRepository.findById(orderDTO.getUser_id())
                .orElseThrow(() -> new RuntimeException("User not found"));


        OrderEntity order = new OrderEntity();

        order.setIdN(orderDTO.getOrderid());
        order.setName(user.getName());
        order.setCategory(orderDTO.getCategory());
        order.setTransactionId(orderDTO.getTransactionId());
        order.setTotalamount(orderDTO.getTotalamount());
        order.setItemscount(orderDTO.getItemscount());
        order.setPayementmethod(orderDTO.getPayementmethod());
        order.setOrderdate(orderDTO.getOrderdate());
        order.setLastupdated(orderDTO.getLastupdated());
        order.setStatus(orderDTO.getStatus());

        // Set the user
        order.setUser(user);

        // Ensure bidirectional update
        if (user.getOrders() == null) {
            user.setOrders(new ArrayList<>());
        }
        if (!user.getOrders().contains(order)) {
            user.getOrders().add(order);
        }

        return orderRepository.save(order);
    }

    public OrderEntity putChange(Long id, OrderPutDTO orderDTO) {


        OrderEntity order =  orderRepository.findById(id) .orElseThrow(() -> new RuntimeException("Order not found with id: " + id));



        order.setCategory(orderDTO.getCategory());


        order.setTotalamount(orderDTO.getTotalamount());
        order.setItemscount(orderDTO.getItemscount());
        order.setPayementmethod(orderDTO.getPayementmethod());
        order.setLastupdated(orderDTO.getLastupdated());
        order.setStatus(orderDTO.getStatus());



        return orderRepository.save(order);

    }
}
