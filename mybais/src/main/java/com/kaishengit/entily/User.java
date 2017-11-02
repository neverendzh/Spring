package com.kaishengit.entily;

import java.util.List;

/**
 * @author zh
 * Created by Administrator on 2017/10/27.
 */
public class User {
    private int id ;
    private String userName;
    private String passwords;
    private String address;
    private int deptId;
    private Dept dept;
    private List<Tag> tagList;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passwords='" + passwords + '\'' +
                ", address='" + address + '\'' +
                ", deptId=" + deptId +
                ", dept=" + dept +
                ", tagList=" + tagList +
                '}';
    }

    public User(int id, String userName, String passwords, String address, int deptId, Dept dept) {
        this.id = id;
        this.userName = userName;
        this.passwords = passwords;
        this.address = address;
        this.deptId = deptId;
        this.dept = dept;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

}
