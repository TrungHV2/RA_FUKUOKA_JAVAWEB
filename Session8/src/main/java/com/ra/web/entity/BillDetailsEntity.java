package com.ra.web.entity;

import javax.persistence.*;

@Entity
@Table(name = "bill_details", schema = "store_manager", catalog = "")
public class BillDetailsEntity {
    private long billDetailId;
    private int quantity;
    private double price;


    private BillsEntity bills;

    private ProductsEntity products;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bill_Detail_Id", nullable = false)
    public long getBillDetailId() {
        return billDetailId;
    }

    public void setBillDetailId(long billDetailId) {
        this.billDetailId = billDetailId;
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
    @Column(name = "Price", nullable = false, precision = 0)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @ManyToOne
    @JoinColumn(name = "Bill_Id", referencedColumnName = "Bill_Id")
    public BillsEntity getBills() {
        return bills;
    }

    public void setBills(BillsEntity bills) {
        this.bills = bills;
    }

    @ManyToOne
    @JoinColumn(name = "Product_Id", referencedColumnName = "Product_Id")
    public ProductsEntity getProducts() {
        return products;
    }

    public void setProducts(ProductsEntity products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillDetailsEntity that = (BillDetailsEntity) o;

        if (billDetailId != that.billDetailId) return false;
        if (quantity != that.quantity) return false;
        if (Double.compare(that.price, price) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (billDetailId ^ (billDetailId >>> 32));
        result = 31 * result + quantity;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
