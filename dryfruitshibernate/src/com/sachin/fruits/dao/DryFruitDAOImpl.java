package com.sachin.fruits.dao;

import com.sachin.fruits.dto.DryFruitDTO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DryFruitDAOImpl implements DryFruitDAO {
	
	@Override
	public int save(DryFruitDTO entity) {
		Configuration config = extractedCfg();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		int pk = (int) session.save(entity);
		System.out.println(pk);
		extracted(factory, session, tr);
		return pk;
	}

	@Override
	public void update(DryFruitDTO entity) {
		Configuration config = extractedCfg();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(entity);
		System.out.println(entity);
		extracted(factory, session, tr);

	}

	@Override
	public void delete(DryFruitDTO entity) {
		Configuration config = extractedCfg();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(entity);
		System.out.println("deleted");
		extracted(factory, session, tr);

	}

	@Override
	public void read( int id){
		DryFruitDTO dto =null;
		Configuration config = extractedCfg();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		dto = session.get(DryFruitDTO.class, id);
		System.out.println(dto);
		extracted(factory, session, tr);

	}

	private Configuration extractedCfg() {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitDTO.class);
		return config;
	}
	private void extracted(SessionFactory factory, Session session, Transaction tr) {
		tr.commit();
		session.close();
		factory.close();
	}
}
