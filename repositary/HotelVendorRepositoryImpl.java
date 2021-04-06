package com.xworkz.fooddelivary.repositary;

import com.xworkz.fooddelivary.entity.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository {

	public HotelVendorRepositoryImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save" + entity);

	}

}
