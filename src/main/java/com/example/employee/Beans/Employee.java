package com.example.employee.Beans;

import jakarta.persistence.*;

@Entity
@Table(name = "emp1")
public class Employee {
    @Id
    @Column(name = "eno")
    private int eno;
    @Column(name = "ename")
    private String ename;
    @Column(name = "esal")
    private float esal;
    @Column(name = "eaddr")
    private String eaddr;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getEsal() {
        return esal;
    }

    public void setEsal(float esal) {
        this.esal = esal;
    }

    public String getEaddr() {
        return eaddr;
    }

    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", esal='" + esal +'\''+
                ", eaddr='" + eaddr + '\'' +
                '}';

    }
}
