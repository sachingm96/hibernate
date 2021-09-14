package com.sachin.mobile.dao;

import com.sachin.mobile.entity.MobileEntity;

public interface MobileDao {

	int save(MobileEntity entity);

	void fetchAll();

	String fetchColorByBrand(String brand);

	int updatePriceById(int price, int id);

	int sumOfPrice();

	int maxOfSizeInInches();

	int minOfSizeInInches();

}
