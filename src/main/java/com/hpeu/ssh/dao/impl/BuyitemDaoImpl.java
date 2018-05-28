package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.BuyitemDao;
import com.hpeu.ssh.entity.Buyitem;

public class BuyitemDaoImpl implements BuyitemDao{
	
	private SessionFactory sessionFactory;
	
	public BuyitemDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(Buyitem entity) {
		getSession().save(entity);
		
	}

	@Override
	public void update(Buyitem entity) {
		getSession().update(entity);
		
	}

	@Override
	public void del(Buyitem entity) {
		getSession().delete(entity);
		
	}

	@Override
	public Buyitem getEntity(String sql, int id) {
		return (Buyitem) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public Buyitem getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buyitem> getAll(String sql) {
		Query<Buyitem> query = getSession().createQuery(sql);
		List<Buyitem> list = query.list();
		return list;
	}

}
