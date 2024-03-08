package com.ra.web.model.entity;

import com.ra.web.util.annotation.Column;
import com.ra.web.util.annotation.Id;
import com.ra.web.util.annotation.Table;

import java.util.Date;

@Table(name = "products")
public class Product {
    @Id
    @Column(name = "Product_Id")
    private String id;
    @Column(name = "Product_Name")
    private String name;
    @Column(name = "Manufacturer")
    private String manufacturer;
    @Column(name = "Batch")
    private int batch;
    @Column(name = "Quantity")
    private int quantity;
    @Column(name = "Created")
    private Date created = new Date();
    @Column(name = "Product_Status")
    private boolean status;

    // <editor-fold> Constructors, Getter, Setter
    public Product() {
    }

    public Product(String id, String name, String manufacturer, int batch, int quantity, Date created, boolean status) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.batch = batch;
        this.quantity = quantity;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    // </editor-fold>
}
