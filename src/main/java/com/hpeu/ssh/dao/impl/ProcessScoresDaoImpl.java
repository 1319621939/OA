package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.ProcessScoresDao;
import com.hpeu.ssh.entity.ProcessScores;

public class ProcessScoresDaoImpl implements ProcessScoresDao {
	
	private SessionFactory sessionFactory;
	
	public ProcessScoresDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(ProcessScores entity) {
		getSession().save(entity);

	}

	@Override
	public void update(ProcessScores entity) {
		getSession().update(entity);

	}

	@Override
	public void del(ProcessScores entity) {
		getSession().delete(entity);

	}

	@Override
	public ProcessScores getEntity(String sql, int id) {
		return (ProcessScores) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public ProcessScores getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessScores> getAll(String sql) {
		Query<ProcessScores> query = getSession().createQuery(sql);
		List<ProcessScores> list = query.list();
		return list;
	}

}
