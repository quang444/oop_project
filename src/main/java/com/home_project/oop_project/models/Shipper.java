package com.home_project.oop_project.models;

import java.sql.Date;

public class Shipper extends Person {
    Shipper(){}
    public Shipper(long id, String name, String password, Date ngaySinh, long sdt, long cccd, String diaChi){
        super(id, name, password, ngaySinh, sdt, cccd, diaChi);
    }
}
