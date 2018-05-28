package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.LeaveDao;
import com.hpeu.ssh.entity.Leave;

public class LeaveDaoImpl implements LeaveDao {
	
	private SessionFactory sessionFactory;
	
	public LeaveDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(Leave entity) {
		getSession().save(entity);

	}

	@Override
	public void update(Leave entity) {
		getSession().update(entity);

	}

	@Override
	public void del(Leave entity) {
		getSession().delete(entity);

	}

	@Override
	public Leave getEntity(String sql, int id) {
		return (Leave) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public Leave getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Leave> getAll(String sql) {
		Query<Leave> query = getSession().createQuery(sql);
		List<Leave> list = query.list();
		return list;
	}

}
