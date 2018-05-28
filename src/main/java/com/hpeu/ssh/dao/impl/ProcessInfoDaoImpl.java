package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.ProcessInfoDao;
import com.hpeu.ssh.entity.ApprovalScores;
import com.hpeu.ssh.entity.ProcessInfo;

public class ProcessInfoDaoImpl implements ProcessInfoDao {
	
private SessionFactory sessionFactory;
	
	public ProcessInfoDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	public void add(ProcessInfo entity) {
		getSession().save(entity);

	}

	@Override
	public void update(ProcessInfo entity) {
		getSession().update(entity);

	}

	@Override
	public void del(ProcessInfo entity) {
		getSession().delete(entity);

	}

	@Override
	public ProcessInfo getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return (ProcessInfo) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public ProcessInfo getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessInfo> getAll(String sql) {
		Query<ProcessInfo> query = getSession().createQuery(sql);
		List<ProcessInfo> list = query.list();
		return list;
	}

}
