package com.home_project.oop_project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.home_project.oop_project.entity.Shipper;
import com.home_project.oop_project.repository.ShipperRepository;
import com.home_project.oop_project.service.ShipperService;

@Service
public class ShipperServiceImpl implements ShipperService{
    private ShipperRepository shipperRepository;
	
	public ShipperServiceImpl(ShipperRepository shipperRepository) {
		super();
		this.shipperRepository = shipperRepository;
	}

	@Override
	public List<Shipper> getAllShippers() {
		return shipperRepository.findAll();
	}

	@Override
	public Shipper saveShipper(Shipper shipper) {
		return shipperRepository.save(shipper);
	}

	@Override
	public Shipper getShipperById(Long id) {
		return shipperRepository.findById(id).get();
	}

	@Override
	public Shipper updateShipper(Shipper shipper) {
		return shipperRepository.save(shipper);
	}

	@Override
	public void deleteShipperById(Long id) {
		shipperRepository.deleteById(id);	
	}
}
