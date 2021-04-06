package com.xworkz.fooddelivary.repositary;

import com.xworkz.fooddelivary.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	public FoodItemRepositoryImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save" + entity);
		System.out.println("should save in to db using JPA");
	}

}
