package com.API.EndPoints.ManagementApi.Controllers;

import com.API.EndPoints.ManagementApi.DTO.OrderDTO;
import com.API.EndPoints.ManagementApi.DTO.OrderPutDTO;
import com.API.EndPoints.ManagementApi.Entity.OrderEntity;
import com.API.EndPoints.ManagementApi.Entity.UserEntity;
import com.API.EndPoints.ManagementApi.Repository.OrderRepository;
import com.API.EndPoints.ManagementApi.Service.OrderService;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders")
    public List<OrderEntity> getAllOrders(){
        return orderRepository.findAll();
    }

    @PostMapping("/orders")
    public OrderEntity postOrder(@RequestBody OrderDTO order){
        System.out.println(order);
        return orderService.saveOrder(order);
    }

    @PutMapping("/orders/{id}")
    public OrderEntity putChange(@PathVariable Long id, @RequestBody OrderPutDTO orderDTO){
        return orderService.putChange(id,orderDTO);
    }









}
