package com.sachin.bird;

import java.util.ArrayList;
import java.util.List;

import com.sachin.bird.dao.BirdDAO;
import com.sachin.bird.dao.BirdDAOImpl;
import com.sachin.bird.entity.BirdEntity;

public class BirdTester {

	public static void main(String[] args) {

		//BirdEntity bird = new BirdEntity(12, "Hen", "red", "female", false, true, 8, 5, 2, 2);
		

		BirdDAO dao = new BirdDAOImpl();
		//  dao.save(bird);
		//  dao.readById(5);
		//	dao.updateNameById(9, "duck");
		//	dao.deleteById(10);
		
		BirdEntity bird1 = new BirdEntity(17, "Hen", "red", "female", false, true, 8, 5, 2, 2);
		BirdEntity bird2 = new BirdEntity(18, "duck", "red", "female", false, true, 8, 5, 2, 2);
		
		List<BirdEntity> list = new ArrayList<>();
		list.add(bird1);
		list.add(bird2);
	
		dao.saveList(list);
		dao.deleteList(list);
	}

}
