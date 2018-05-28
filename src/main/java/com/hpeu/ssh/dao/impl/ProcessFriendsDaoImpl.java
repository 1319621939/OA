package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.ProcessFriendsDao;
import com.hpeu.ssh.entity.ProcessFriends;

public class ProcessFriendsDaoImpl implements ProcessFriendsDao {
	
	private SessionFactory sessionFactory;
	
	public ProcessFriendsDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(ProcessFriends entity) {
		getSession().save(entity);

	}

	@Override
	public void update(ProcessFriends entity) {
		getSession().update(entity);

	}

	@Override
	public void del(ProcessFriends entity) {
		getSession().delete(entity);

	}

	@Override
	public ProcessFriends getEntity(String sql, int id) {
		return (ProcessFriends) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public ProcessFriends getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessFriends> getAll(String sql) {
		Query<ProcessFriends> query = getSession().createQuery(sql);
		List<ProcessFriends> list = query.list();
		return list;
	}

}
