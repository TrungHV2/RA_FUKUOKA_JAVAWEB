package com.ra.web.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employees", schema = "store_manager", catalog = "")
public class EmployeesEntity {
    private String empId;
    private String empName;
    private Date birthOfDate;
    private String email;
    private String phone;
    private String address;
    private short empStatus;

    @Id
    @Column(name = "Emp_Id", nullable = false, length = 5)
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "Emp_Name", nullable = false, length = 100)
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Basic
    @Column(name = "Birth_Of_Date", nullable = true)
    public Date getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    @Basic
    @Column(name = "Email", nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Phone", nullable = false, length = 100)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "Address", nullable = false, length = -1)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Emp_Status", nullable = false)
    public short getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(short empStatus) {
        this.empStatus = empStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeesEntity that = (EmployeesEntity) o;

        if (empStatus != that.empStatus) return false;
        if (empId != null ? !empId.equals(that.empId) : that.empId != null) return false;
        if (empName != null ? !empName.equals(that.empName) : that.empName != null) return false;
        if (birthOfDate != null ? !birthOfDate.equals(that.birthOfDate) : that.birthOfDate != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (birthOfDate != null ? birthOfDate.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (int) empStatus;
        return result;
    }
}
