package me.baijuyi.jwa.entity;

import java.io.Serializable;

public class Department implements Serializable {
    private String deptName;
    private String deptAddr;

    public Department() {
    }

    public Department(String deptName, String deptAddr) {
        this.deptName = deptName;
        this.deptAddr = deptAddr;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptAddr() {
        return deptAddr;
    }

    public void setDeptAddr(String deptAddr) {
        this.deptAddr = deptAddr;
    }
}
