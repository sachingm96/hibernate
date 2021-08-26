package com.sachin.fruits.dao;

import com.sachin.fruits.dto.DryFruitDTO;

public interface DryFruitDAO {

	int save(DryFruitDTO entity);

	void update(DryFruitDTO entity);

	void delete(DryFruitDTO entity);

	void read(int id);
}
