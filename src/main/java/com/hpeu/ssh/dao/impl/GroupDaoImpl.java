package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.GroupDao;
import com.hpeu.ssh.entity.Group;

public class GroupDaoImpl implements GroupDao {
	
	private SessionFactory sessionFactory;
	
	public GroupDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(Group entity) {
		getSession().save(entity);

	}

	@Override
	public void update(Group entity) {
		getSession().update(entity);

	}

	@Override
	public void del(Group entity) {
		getSession().delete(entity);

	}

	@Override
	public Group getEntity(String sql, int id) {
		return (Group) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public Group getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> getAll(String sql) {
		Query<Group> query = getSession().createQuery(sql);
		List<Group> list = query.list();
		return list;
	}

}
