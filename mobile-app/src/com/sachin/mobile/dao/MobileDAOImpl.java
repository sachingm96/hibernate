package com.sachin.mobile.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sachin.mobile.entity.MobileEntity;
import com.sachin.mobile.util.SFUtil;

public class MobileDAOImpl implements MobileDao {

	private SessionFactory factory = SFUtil.getFactory();

	public int save(MobileEntity entity) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			int pk = (int) session.save(entity);
			trans.commit();
			System.out.println(entity);
			return pk;
		}
	}

	public void fetchAll() {
		try (Session session = factory.openSession()) {
			Transaction tr = session.beginTransaction();
			Query query = session.getNamedQuery("fetchAll ");
			List mob = query.list();
			System.out.println(mob);
		}
	}

	public String fetchColorByBrand(String brand) {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("fetchColorByBrand");
			Object obj = query.uniqueResult();
			query.setParameter("Brand", brand);
			System.out.println(obj);
			if (obj != null) {
				String color = (String) obj;
				return color;
			}
		}
		return null;
	}

	public int updatePriceById(int price, int id) {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("updatePriceById");
			query.setParameter("Id", id);
			query.setParameter("Price", price);
			session.beginTransaction();
			query.executeUpdate();
			session.getTransaction().commit();
			
		}
		return 0;
	}

	public int sumOfPrice() {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("sumOfPrice");
			Object obj = query.uniqueResult();
			System.out.println(obj);
			if (obj != null) {
				int sum = (int) obj;
				return sum;
			}
		}
		return 0;
	}

	public int maxOfSizeInInches() {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("maxOfSizeInInches");
			Object obj = query.uniqueResult();
			System.out.println(obj);
			;
		}
		return 0;

	}

	public int minOfSizeInInches() {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("minOfSizeInInches");
			Object obj = query.uniqueResult();
			System.out.println(obj);
		}
		return 0;
	}

}
