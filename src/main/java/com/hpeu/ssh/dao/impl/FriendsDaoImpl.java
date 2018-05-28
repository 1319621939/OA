package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.FriendsDao;
import com.hpeu.ssh.entity.Friends;

public class FriendsDaoImpl implements FriendsDao {
	
	private SessionFactory sessionFactory;
	
	public FriendsDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(Friends entity) {
		getSession().save(entity);

	}

	@Override
	public void update(Friends entity) {
		getSession().update(entity);

	}

	@Override
	public void del(Friends entity) {
		getSession().delete(entity);

	}

	@Override
	public Friends getEntity(String sql, int id) {
		return (Friends) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public Friends getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Friends> getAll(String sql) {
		Query<Friends> query = getSession().createQuery(sql);
		List<Friends> list = query.list();
		return list;
	}

}
