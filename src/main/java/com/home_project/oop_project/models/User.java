package com.home_project.oop_project.models;

import java.sql.Date;

public class User extends Person {
    private String email;
    User(){}
    public User(long id, String name, String password, Date ngaySinh, long sdt, long cccd, String diaChi, String email){
        super(id, name, password, ngaySinh, sdt, cccd, diaChi);
        this.email = email;
    }
}
