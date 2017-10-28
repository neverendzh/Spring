package com.kaishengit.entily;

/**
 * @author zh
 * Created by Administrator on 2017/10/27.
 */
public class Dept {
    private int id;
    private String deptDepartment;

    public Dept() {
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptDepartment='" + deptDepartment + '\'' +
                '}';
    }

    public Dept(int id, String deptDepartment) {
        this.id = id;
        this.deptDepartment = deptDepartment;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptDepartment() {
        return deptDepartment;
    }

    public void setDeptDepartment(String deptDepartment) {
        this.deptDepartment = deptDepartment;
    }
}
