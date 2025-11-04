package com.API.EndPoints.ManagementApi.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderDTO {

    private String orderid;
    private String category;
    private String transactionId;
    private Double totalamount;
    private Integer itemscount;
    private String payementmethod;

    private LocalDateTime orderdate;


    private LocalDateTime lastupdated;

    private String status;


    private String user_id;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public OrderDTO(String orderid, String category, String transactionId, Double totalamount, Integer itemscount, String payementmethod, LocalDateTime orderdate, LocalDateTime lastupdated, String status, String user_id) {
        this.orderid = orderid;
        this.category = category;
        this.transactionId = transactionId;
        this.totalamount = totalamount;
        this.itemscount = itemscount;
        this.payementmethod = payementmethod;
        this.orderdate = orderdate;
        this.lastupdated = lastupdated;
        this.status = status;
        this.user_id = user_id;
    }

    public OrderDTO() {
    }

    public OrderDTO(String orderid, String category, String transactionId, Double totalamount, Integer itemscount, String payementmethod, String status, String user_id) {
        this.orderid = orderid;
        this.category = category;
        this.transactionId = transactionId;
        this.totalamount = totalamount;
        this.itemscount = itemscount;
        this.payementmethod = payementmethod;
        this.status = status;
        this.user_id = user_id;
    }

    public OrderDTO(String orderid, String category, String transactionId, Double totalamount, Integer itemscount, String payementmethod, LocalDateTime orderdate, LocalDateTime lastupdated, String status) {
        this.orderid = orderid;
        this.category = category;
        this.transactionId = transactionId;
        this.totalamount = totalamount;
        this.itemscount = itemscount;
        this.payementmethod = payementmethod;
        this.orderdate = orderdate;
        this.lastupdated = lastupdated;
        this.status = status;
    }


    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
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

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderid='" + orderid + '\'' +
                ", category='" + category + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", totalamount=" + totalamount +
                ", itemscount=" + itemscount +
                ", payementmethod='" + payementmethod + '\'' +
                ", orderdate=" + orderdate +
                ", lastupdated=" + lastupdated +
                ", status='" + status + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
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
}
