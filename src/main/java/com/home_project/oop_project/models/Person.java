package com.home_project.oop_project.models;

import java.sql.Date;

public class Person {
    private long id;
    private String name;
    private String password;
    private Date ngaySinh;
    private long sdt;
    private long cccd;
    private String diaChi;
    

    public Person(){};
    public Person(long id, String name, String password, Date ngaySinh, long sdt, long cccd, String diaChi){
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.cccd = cccd;
        this.diaChi = diaChi;
    }

}
