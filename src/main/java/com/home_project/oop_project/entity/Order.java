package com.home_project.oop_project.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "start_point", nullable = false)
	private String start_point;
	
	@Column(name = "end_point")
	private String end_point;
	
	@Column(name = "value")
	private String value;

	@Column(name = "shipperID")
	private String shipperID;

	@Column(name = "status")
	private String status;
	
	public Order() {
		super();
	}
	
	public Order(String start_point,String end_point,String value,String shipperID,String status) {
		super();
		this.start_point = start_point;
		this.end_point = end_point;
		this.value = value;
		this.shipperID = shipperID;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getStartPoint() {
		return start_point;
	}
	public void setStartPoint(String start_point) {
		this.start_point = start_point;
	}

	public String getEndPoint() {
		return end_point;
	}

	public void setEndPoint(String end_point) {
		this.end_point = end_point;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getShipperID() {
		return shipperID;
	}

	public void setShipperID(String shipperID) {
		this.shipperID = shipperID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
