package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.ApprovalScoresDao;
import com.hpeu.ssh.entity.ApprovalScores;

public class ApprovalScoresDaoImpl implements ApprovalScoresDao {
	
	private SessionFactory sessionFactory;
	
	public ApprovalScoresDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	public void add(ApprovalScores entity) {
		getSession().save(entity);

	}

	@Override
	public void update(ApprovalScores entity) {
		getSession().update(entity);

	}

	@Override
	public void del(ApprovalScores entity) {
		getSession().delete(entity);

	}

	@Override
	public ApprovalScores getEntity(String sql, int id) {
		return (ApprovalScores) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public ApprovalScores getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApprovalScores> getAll(String sql) {
		Query<ApprovalScores> query = getSession().createQuery(sql);
		List<ApprovalScores> list = query.list();
		return list;
	}

}
