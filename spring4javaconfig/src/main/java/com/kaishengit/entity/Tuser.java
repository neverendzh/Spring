package com.kaishengit.entity;

/**
 * 实体类
 * @author zh
 * Created by Administrator on 2017/10/30.
 */
public class Tuser {
    private int id;

    @Override
    public String toString() {
        return "Tuser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passwords='" + passwords + '\'' +
                ", address='" + address + '\'' +
                ", deptId=" + deptId +
                '}';
    }

    private String userName;
    private String passwords;
    private String address;
    private int deptId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
