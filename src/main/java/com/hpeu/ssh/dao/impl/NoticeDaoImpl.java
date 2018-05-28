package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.NoticeDao;
import com.hpeu.ssh.entity.Notice;

public class NoticeDaoImpl implements NoticeDao {
	
	private SessionFactory sessionFactory;
	
	public NoticeDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(Notice entity) {
		getSession().save(entity);

	}

	@Override
	public void update(Notice entity) {
		getSession().update(entity);

	}

	@Override
	public void del(Notice entity) {
		getSession().delete(entity);

	}

	@Override
	public Notice getEntity(String sql, int id) {
		return (Notice) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public Notice getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notice> getAll(String sql) {
		Query<Notice> query = getSession().createQuery(sql);
		List<Notice> list = query.list();
		return list;
	}

}
