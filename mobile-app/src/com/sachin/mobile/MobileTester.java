package com.sachin.mobile;

import com.sachin.mobile.dao.MobileDAOImpl;
import com.sachin.mobile.dao.MobileDao;
import com.sachin.mobile.entity.MobileEntity;

public class MobileTester {

	public static void main(String[] args) {
		
		MobileEntity mobile = new MobileEntity("sony", 18000, 200, "white", true, 5);
		
		MobileDao dao= new MobileDAOImpl();
		//dao.save(mobile);
		//dao.fetchAll();
		//dao.fetchColorByBrand();
		dao.updatePriceById();
		//dao.sumOfPrice();
		//dao.maxOfSizeInInches();
		//dao.minOfSizeInInches();
	}

}
