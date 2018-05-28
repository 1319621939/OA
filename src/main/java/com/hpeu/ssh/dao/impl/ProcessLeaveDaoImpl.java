package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.ProcessLeaveDao;
import com.hpeu.ssh.entity.ProcessLeave;

public class ProcessLeaveDaoImpl implements ProcessLeaveDao {
	
	private SessionFactory sessionFactory;
	
	public ProcessLeaveDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(ProcessLeave entity) {
		getSession().save(entity);

	}

	@Override
	public void update(ProcessLeave entity) {
		getSession().update(entity);

	}

	@Override
	public void del(ProcessLeave entity) {
		getSession().delete(entity);

	}

	@Override
	public ProcessLeave getEntity(String sql, int id) {
		return (ProcessLeave) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public ProcessLeave getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessLeave> getAll(String sql) {
		Query<ProcessLeave> query = getSession().createQuery(sql);
		List<ProcessLeave> list = query.list();
		return list;
	}

}
