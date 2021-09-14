package com.sachin.mobile.service;

import com.sachin.mobile.dao.MobileDAOImpl;
import com.sachin.mobile.dao.MobileDao;
import com.sachin.mobile.entity.MobileEntity;

public class MobileServiceImpl implements MobileService {

	MobileDao dao = new MobileDAOImpl();
	
	@Override
	public int validateAndSave(MobileEntity entity) {
		boolean validateBrand = false;
		boolean validatePrice = false;
		boolean validateIsAndriod;
		if (entity != null) {
			System.out.println("entity is not null, validate data");
			String brand = entity.getBrand();
			if (brand != null && !brand.isEmpty() && brand.length() > 4 && brand.length() < 10) {
				System.out.println("brand is valid");
				validateBrand = true;
			} else {
				System.out.println("brand is invalid");
				validateBrand = false;
			}
			double price = entity.getPrice();
			if (price > 1000 && price < 10000) {
				System.out.println("price is valid");
				validatePrice = true;
			} else {
				System.out.println("price is invalid");
				validatePrice = false;
			}
			Boolean isAndriod = entity.isAndriod();
			if (isAndriod != null) {
				System.out.println("isAndriod is valid");
				validateIsAndriod = true;
			} else {
				System.out.println("isAndriod is invalid");
				validateIsAndriod = false;
			}
			if (validateBrand && validatePrice && validateIsAndriod) {
				System.out.println("running successfully,success");
				dao.save(entity);
				return 1;
			}
		} else {
			System.out.println("entity is null");
		}
		return 0;
	}

	@Override
	public void validateAndFetchAll() {
		this.dao.fetchAll();
		
	}

	@Override
	public String validateAndFetchColorByBrand(String brand) {
		return this.dao.fetchColorByBrand(brand);
	}

	@Override
	public void validateAndUpdatePriceById(int price, int id) {
		 this.dao.updatePriceById(price, id);
	}

	@Override
	public int validateAndSumOfPrice() {
		return this.dao.sumOfPrice();
	}

	@Override
	public int validateAndMaxOfSizeInInches() {
		return this.dao.maxOfSizeInInches();
		
	}

	@Override
	public int validateAndMinOfSizeInInches() {
		return this.dao.minOfSizeInInches();
	}
	

}
