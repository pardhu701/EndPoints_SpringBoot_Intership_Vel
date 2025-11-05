package com.API.EndPoints.ManagementApi.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idN;

    private String name;
    private String category;
    private String transactionId;
    private Double totalamount;
    private Integer itemscount;
    private String payementmethod;




    @CreatedDate
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // For form binding
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime orderdate;


    @LastModifiedDate
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // For form binding
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastupdated;

    private String status;


    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private UserEntity user;


    public OrderEntity() {
    }

    public OrderEntity(Long id, String idN, String name, String category, String transactionId, Double totalamount, Integer itemscount, String payementmethod, LocalDateTime orderdate, LocalDateTime lastupdated, String status, UserEntity user) {
        this.id = id;
        this.idN = idN;
        this.name = name;
        this.category = category;
        this.transactionId = transactionId;
        this.totalamount = totalamount;
        this.itemscount = itemscount;
        this.payementmethod = payementmethod;
        this.orderdate = orderdate;
        this.lastupdated = lastupdated;
        this.status = status;
        this.user = user;
    }

    public OrderEntity(String idN, String name, String category, String transactionId, Double totalamount, Integer itemscount, String payementmethod, LocalDateTime orderdate, LocalDateTime lastupdated, String status, UserEntity user) {
        this.idN = idN;
        this.name = name;
        this.category = category;
        this.transactionId = transactionId;
        this.totalamount = totalamount;
        this.itemscount = itemscount;
        this.payementmethod = payementmethod;
        this.orderdate = orderdate;
        this.lastupdated = lastupdated;
        this.status = status;
        this.user = user;
    }

    public OrderEntity(Long id, String idN, String name, String category, String transactionId, Double totalamount, Integer itemscount, String payementmethod, String status, UserEntity user) {
        this.id = id;
        this.idN = idN;
        this.name = name;
        this.category = category;
        this.transactionId = transactionId;
        this.totalamount = totalamount;
        this.itemscount = itemscount;
        this.payementmethod = payementmethod;
        this.status = status;
        this.user = user;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdN() {
        return idN;
    }

    public void setIdN(String idN) {
        this.idN = idN;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Double getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Double totalamount) {
        this.totalamount = totalamount;
    }

    public Integer getItemscount() {
        return itemscount;
    }

    public void setItemscount(Integer itemscount) {
        this.itemscount = itemscount;
    }

    public String getPayementmethod() {
        return payementmethod;
    }

    public void setPayementmethod(String payementmethod) {
        this.payementmethod = payementmethod;
    }

    public LocalDateTime getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(LocalDateTime orderdate) {
        this.orderdate = orderdate;
    }

    public LocalDateTime getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(LocalDateTime lastupdated) {
        this.lastupdated = lastupdated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }


}
