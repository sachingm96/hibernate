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
			Query query = session.createQuery("from MobileEntity");
			List mob = query.list();
			System.out.println(mob);
		}
	}

	public String fetchColorByBrand() {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("select color from MobileEntity where brand='redmi'");
			Object obj = query.uniqueResult();
			System.out.println(obj);
			if (obj != null) {
				String color = (String) obj;
				return color;
			}
		}
		return null;
	}

	public int updatePriceById() {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("update MobileEntity mobile set mobile.price='1000' where mobile.id='1'");
			session.beginTransaction();
			query.executeUpdate();
			session.getTransaction().commit();
			
		}
		return 0;
	}

	public int sumOfPrice() {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("select sum(price) from MobileEntity");
			Object obj = query.uniqueResult();
			System.out.println(obj);
//			if (obj != null) {
//				int sum = (int) obj;
//				return sum;
//			}
		}
		return 0;
	}

	public void maxOfSizeInInches() {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("select max(sizeInInches) from MobileEntity");
			Object obj = query.uniqueResult();
			System.out.println(obj);
			;
		}

	}

	public void minOfSizeInInches() {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("select min(sizeInInches) from MobileEntity");
			Object obj = query.uniqueResult();
			System.out.println(obj);
		}
	}

}
