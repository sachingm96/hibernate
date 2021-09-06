package com.sachin.bird.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sachin.bird.entity.BirdEntity;
import com.sachin.bird.util.SFUtil;

public class BirdDAOImpl implements BirdDAO {

	private SessionFactory factory = SFUtil.getFactory();

	public int save(BirdEntity entity) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			int pk = (int) session.save(entity);
			trans.commit();
			System.out.println(entity);
			return pk;
		}

	}

	public BirdEntity readById(int id) {
		try (Session session = factory.openSession()) {
			BirdEntity entity = session.get(BirdEntity.class, id);
			System.out.println(entity);
			return entity;
		}
	}

	public void updateNameById(int id, String name) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			BirdEntity entity = session.get(BirdEntity.class, id);
			entity.setName(name);
			System.out.println("updated name by id : " + entity);
			trans.commit();
		}
	}

	public void deleteById(int id) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			BirdEntity entity = session.get(BirdEntity.class, id);
			session.delete(entity);
			System.out.println("deleted by id : " + entity);
			trans.commit();
		}
	}

	@Override
	public void saveList(List<BirdEntity> entity) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			entity.forEach(a -> {
				session.save(a);
				System.out.println(a);
			});
			trans.commit();
		}
	}

	@Override
	public void deleteList(List<Integer> id) {
		try (Session session = factory.openSession()) {
			Transaction tr = session.beginTransaction();
			id.forEach(delete -> {
				BirdEntity birdEntity = session.get(BirdEntity.class, delete);
				session.delete(birdEntity);
				System.out.println(birdEntity);
			});
			tr.commit();
		}
	}

	@Override
	public void read() {
		try (Session session = factory.openSession()) {
			Transaction tr = session.beginTransaction();
			Query query = session.createQuery("from BirdEntity");
			List bird = query.list();
			System.out.println(bird);

		}
	}

}
