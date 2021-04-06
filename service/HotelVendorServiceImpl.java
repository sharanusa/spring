package com.xworkz.fooddelivary.service;

import com.xworkz.fooddelivary.entity.HotelVendorEntity;
import com.xworkz.fooddelivary.repositary.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService {

	private HotelVendorRepository repository;

	public HotelVendorServiceImpl(HotelVendorRepository repository) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(HotelVendorEntity entity) {
		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not valid");
		}
		return false;
	}
}
