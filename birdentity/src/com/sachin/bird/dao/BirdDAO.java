package com.sachin.bird.dao;

import java.util.List;

import com.sachin.bird.entity.BirdEntity;

public interface BirdDAO {

	int save(BirdEntity entity);

	BirdEntity readById(int id);

	void updateNameById(int id, String name);

	void deleteById(int id);

	void saveList(List<BirdEntity> entity);
	
	void deleteList(List<Integer> entity);
	
	void read();

}
