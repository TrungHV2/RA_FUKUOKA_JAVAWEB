package com.ra.web.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "orders", schema = "gaminghouse", catalog = "")
public class OrdersEntity {
    private String id;
    private String computerId;
    private Timestamp startTime;
    private Double totalTime;
    private Double pricePerHours;
    private Timestamp created;
    private Boolean status;

    @Id
    @Column(name = "id")
    @GenericGenerator(name = "uid-hibernate", strategy = "org.hibernate.id.GUIDGenerator")
    @GeneratedValue(generator = "uid-hibernate")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "computerId")
    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    @Basic
    @Column(name = "startTime")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "totalTime")
    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    @Basic
    @Column(name = "pricePerHours")
    public Double getPricePerHours() {
        return pricePerHours;
    }

    public void setPricePerHours(Double pricePerHours) {
        this.pricePerHours = pricePerHours;
    }

    @Basic
    @Column(name = "created")
    @CreationTimestamp // thời gian tạo bản ghi
    //@UpdateTimestamp // thời gian update bản ghi
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "status")
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (computerId != null ? !computerId.equals(that.computerId) : that.computerId != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (totalTime != null ? !totalTime.equals(that.totalTime) : that.totalTime != null) return false;
        if (pricePerHours != null ? !pricePerHours.equals(that.pricePerHours) : that.pricePerHours != null)
            return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (computerId != null ? computerId.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (totalTime != null ? totalTime.hashCode() : 0);
        result = 31 * result + (pricePerHours != null ? pricePerHours.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
