package com.API.EndPoints.ManagementApi.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;


@Entity
public class UserEntity {
    @Id
    private String id;
    private String name;
    private Long age;

    private String type;
    private Integer adminpasscode =0;

    private Integer createadminpass=0;



    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<OrderEntity> orders;


    public UserEntity(String id, String name, Long age,  List<OrderEntity> orders) {
        this.id = id;
        this.name = name;
        this.age = age;

        this.orders = orders;
    }


    public UserEntity(String id, String name, Long age, String type, Integer adminpasscode, Integer createadminpass, List<OrderEntity> orders) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.adminpasscode = adminpasscode;
        this.createadminpass = createadminpass;
        this.orders = orders;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAdminpasscode() {
        return adminpasscode;
    }

    public void setAdminpasscode(Integer adminpasscode) {
        this.adminpasscode = adminpasscode;
    }

    public Integer getCreateadminpass() {
        return createadminpass;
    }

    public void setCreateadminpass(Integer createadminpass) {
        this.createadminpass = createadminpass;
    }

    public UserEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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



    public List<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderEntity> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", orders=" + orders +
                '}';
    }
}
