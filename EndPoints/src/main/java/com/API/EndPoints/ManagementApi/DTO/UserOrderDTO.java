package com.API.EndPoints.ManagementApi.DTO;
import java.util.List;
public class UserOrderDTO {

    private String userid;
    private String name;
    private Long age;

    private  String email;
    private List<OrderDTO> orders;

    public UserOrderDTO() {
    }

    public UserOrderDTO(String userid, String name, Long age, String email, List<OrderDTO> orders) {
        this.userid = userid;
        this.name = name;
        this.age = age;
        this.email = email;
        this.orders = orders;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }
}
