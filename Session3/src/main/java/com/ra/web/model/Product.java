package com.ra.web.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @NotNull - kiểm tra giá trị null
 * @NotEmpty - kiểm tra không được trống và empty
 * @NotBlank - kiểm tra không null hoặc khoảng trắng
 * @Size - kiểm tra độ dài max, min
 * @Min - kiểm tra giá trị tối thiểu
 * @Max - kiểm tra giá trị đối đa
 * @Email - kiểm tra định dạng email
 * @Pattern - kiểm tra giá trị theo định dạng regex
 */

public class Product {
    @NotEmpty(message = "Mã sp không được bỏ trống!")
    private String id;
    @NotEmpty(message = "Tên sp không được bỏ trống!")
    private String name;
    private float price;
    private String image;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created;
    private boolean status;

    public Product() {
    }

    public Product(String id, String name, float price, String image, Date created, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.created = created;
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
