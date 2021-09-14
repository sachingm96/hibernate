package com.sachin.mobile.service;

import com.sachin.mobile.entity.MobileEntity;

public interface MobileService {

	int validateAndSave(MobileEntity entity);

	void validateAndFetchAll();

	String validateAndFetchColorByBrand(String brand);

	void validateAndUpdatePriceById(int price, int id);

	int validateAndSumOfPrice();

	int validateAndMaxOfSizeInInches();

	int validateAndMinOfSizeInInches();
}
