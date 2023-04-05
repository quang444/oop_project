package com.home_project.oop_project.models;

import java.sql.Date;

public class Admin extends Person {
    Admin(){}
    public Admin(long id, String name, String password, Date ngaySinh, long sdt, long cccd, String diaChi){
        super(id, name, password, ngaySinh, sdt, cccd, diaChi);
    }
}
