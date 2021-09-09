package com.sachin.mobile.dao;

import com.sachin.mobile.entity.MobileEntity;

public interface MobileDao {

	int save(MobileEntity entity);

	void fetchAll();

	String fetchColorByBrand();

	int updatePriceById();

	int sumOfPrice();

	void maxOfSizeInInches();

	void minOfSizeInInches();

}
