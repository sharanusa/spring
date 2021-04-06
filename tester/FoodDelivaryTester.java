package com.xworkz.fooddelivary.tester;

import com.xworkz.fooddelivary.constants.FoodType;
import com.xworkz.fooddelivary.entity.FoodItemEntity;
import com.xworkz.fooddelivary.repositary.FoodItemRepository;
import com.xworkz.fooddelivary.repositary.FoodItemRepositoryImpl;
import com.xworkz.fooddelivary.service.FoodItemService;
import com.xworkz.fooddelivary.service.FoodItemServiceImpl;

public class FoodDelivaryTester {

	public static void main(String[] args) {

		FoodItemEntity entity = new FoodItemEntity("curdRice", 70.0, FoodType.SOUTH_INDIAN, 2, 5);

		FoodItemRepository repository = new FoodItemRepositoryImpl();
		FoodItemService service = new FoodItemServiceImpl(repository);
		boolean save = service.validateAndSave(entity);
		System.out.println(save);
	}

}
