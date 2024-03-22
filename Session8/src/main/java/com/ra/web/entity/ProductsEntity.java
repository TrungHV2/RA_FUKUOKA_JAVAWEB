package com.ra.web.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "products", schema = "store_manager", catalog = "")
public class ProductsEntity {
    private String productId;
    private String productName;
    private String manufacturer;
    private Timestamp created;
    private short batch;
    private int quantity;
    private Boolean productStatus;

    private List<BillDetailsEntity> billDetails = new ArrayList<>();

    public ProductsEntity() {
    }

    public ProductsEntity(String productId) {
        this.productId = productId;
    }

    @Id
    // Áp dụng cho id là string sử dụng UUID
    //@GenericGenerator(name = "uid-hibernate", strategy = "org.hibernate.id.GUIDGenerator")
    //@GeneratedValue(generator = "uid-hibernate")
    @Column(name = "Product_Id", nullable = false, length = 5)
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "Product_Name", nullable = false, length = 150)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "Manufacturer", nullable = false, length = 200)
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Basic
    @Column(name = "Created", nullable = true)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "Batch", nullable = false)
    public short getBatch() {
        return batch;
    }

    public void setBatch(short batch) {
        this.batch = batch;
    }

    @Basic
    @Column(name = "Quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "Product_Status", nullable = true)
    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    @OneToMany(mappedBy = "products")
    public List<BillDetailsEntity> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetailsEntity> billDetails) {
        this.billDetails = billDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsEntity that = (ProductsEntity) o;

        if (batch != that.batch) return false;
        if (quantity != that.quantity) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (productStatus != null ? !productStatus.equals(that.productStatus) : that.productStatus != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (int) batch;
        result = 31 * result + quantity;
        result = 31 * result + (productStatus != null ? productStatus.hashCode() : 0);
        return result;
    }
}
