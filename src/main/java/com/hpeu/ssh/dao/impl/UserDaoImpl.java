package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.UserDao;
import com.hpeu.ssh.entity.User;

public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	
	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(User entity) {
		getSession().save(entity);

	}

	@Override
	public void update(User entity) {
		getSession().update(entity);

	}

	@Override
	public void del(User entity) {
		getSession().delete(entity);

	}

	@Override
	public User getEntity(String sql, int id) {
		return (User) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public User getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll(String sql) {
		Query<User> query = getSession().createQuery(sql);
		List<User> list = query.list();
		return list;
	}

}
