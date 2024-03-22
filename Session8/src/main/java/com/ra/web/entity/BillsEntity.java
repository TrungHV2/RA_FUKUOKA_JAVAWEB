package com.ra.web.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "bills", schema = "store_manager", catalog = "")
public class BillsEntity {
    private long billId;
    private String billCode;
    private boolean billType;
    @CreationTimestamp
    private Timestamp created;
    @UpdateTimestamp
    private Timestamp authDate;
    private short billStatus;

    private Set<BillDetailsEntity> billDetails;

    public BillsEntity() {
    }

    public BillsEntity(long billId) {
        this.billId = billId;
    }

    @Id
    @Column(name = "Bill_Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "Bill_Code", nullable = false, length = 10)
    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    @Basic
    @Column(name = "Bill_Type", nullable = false)
    public boolean isBillType() {
        return billType;
    }

    public void setBillType(boolean billType) {
        this.billType = billType;
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
    @Column(name = "Auth_Date", nullable = true)
    public Timestamp getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Timestamp authDate) {
        this.authDate = authDate;
    }

    @Basic
    @Column(name = "Bill_Status", nullable = false)
    public short getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(short billStatus) {
        this.billStatus = billStatus;
    }

    @OneToMany(mappedBy = "bills")
    public Set<BillDetailsEntity> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(Set<BillDetailsEntity> billDetails) {
        this.billDetails = billDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillsEntity that = (BillsEntity) o;

        if (billId != that.billId) return false;
        if (billType != that.billType) return false;
        if (billStatus != that.billStatus) return false;
        if (billCode != null ? !billCode.equals(that.billCode) : that.billCode != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (authDate != null ? !authDate.equals(that.authDate) : that.authDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (billId ^ (billId >>> 32));
        result = 31 * result + (billCode != null ? billCode.hashCode() : 0);
        result = 31 * result + (billType ? 1 : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (authDate != null ? authDate.hashCode() : 0);
        result = 31 * result + (int) billStatus;
        return result;
    }
}
