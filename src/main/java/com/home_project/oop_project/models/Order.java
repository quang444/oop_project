package com.home_project.oop_project.models;

public class Order {
    private long id_order;
    private long id_shipper;
    private long id_user;
    private String vt_from;
    private String vt_to;
    private String good_name;
    private long good_price;

    public Order(){};
    public Order(long id_order, long id_shipper, long id_user, String vt_from, String vt_to, String good_name, long good_price){
        this.id_order = id_order;
        this.id_shipper = id_shipper;
        this.id_user = id_user;
        this.vt_from = vt_from;
        this.vt_to = vt_to;
        this.good_name = good_name;
        this.good_price = good_price;
    }
}
