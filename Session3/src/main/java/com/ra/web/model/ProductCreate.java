package com.ra.web.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

public class ProductCreate implements Serializable {
    private String id;
    private String name;
    private float price;
    private MultipartFile image;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created;
    private boolean status;

    public ProductCreate() {
    }

    public ProductCreate(String id, String name, float price, MultipartFile image, Date created, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.created = created;
        this.status = status;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
