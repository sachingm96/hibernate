package com.sachin.fruits;

import com.sachin.fruits.dao.DryFruitDAO;
import com.sachin.fruits.dao.DryFruitDAOImpl;
import com.sachin.fruits.dto.DryFruitDTO;

public class DryFruitTester {

	public static void main(String[] args) {

		DryFruitDTO dto = new DryFruitDTO(1, "Almonds", "Nutraj", "Karnataka", 896, "amzon");

		DryFruitDAO dao = new DryFruitDAOImpl();
		dao.save(dto);

	}

}
