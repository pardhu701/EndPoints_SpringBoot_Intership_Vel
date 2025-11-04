package com.API.EndPoints.ManagementApi.DTO;

import java.time.LocalDateTime;

public class OrderPutDTO {

    private String category;

    private Double totalamount;
    private Integer itemscount;
    private String payementmethod;

    private String status;
    private LocalDateTime lastupdated;

    public OrderPutDTO() {
    }

    public OrderPutDTO(String category, Double totalamount, Integer itemscount, String payementmethod, String status) {
        this.category = category;
        this.totalamount = totalamount;
        this.itemscount = itemscount;
        this.payementmethod = payementmethod;
        this.status = status;
    }

    public OrderPutDTO(String category, Double totalamount, Integer itemscount, String payementmethod, String status, LocalDateTime lastupdated) {
        this.category = category;
        this.totalamount = totalamount;
        this.itemscount = itemscount;
        this.payementmethod = payementmethod;
        this.status = status;
        this.lastupdated = lastupdated;
    }

    public String getCategory() {
        return category;
    }

    public LocalDateTime getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(LocalDateTime lastupdated) {
        this.lastupdated = lastupdated;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
