package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.ApprovalInfoDao;
import com.hpeu.ssh.entity.ApprovalInfo;
import com.hpeu.ssh.entity.ApprovalScores;

public class ApprovalInfoDaoImpl implements ApprovalInfoDao {
	
private SessionFactory sessionFactory;
	
	public ApprovalInfoDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	public void add(ApprovalInfo entity) {
		getSession().save(entity);

	}

	@Override
	public void update(ApprovalInfo entity) {
		getSession().update(entity);

	}

	@Override
	public void del(ApprovalInfo entity) {
		getSession().delete(entity);

	}

	@Override
	public ApprovalInfo getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return (ApprovalInfo) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public ApprovalInfo getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApprovalInfo> getAll(String sql) {
		Query<ApprovalInfo> query = getSession().createQuery(sql);
		List<ApprovalInfo> list = query.list();
		return list;
	}

}
