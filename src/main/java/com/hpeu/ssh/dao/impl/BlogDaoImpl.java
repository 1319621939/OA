package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.BlogDao;
import com.hpeu.ssh.entity.ApprovalScores;
import com.hpeu.ssh.entity.Blog;

public class BlogDaoImpl implements BlogDao {
	
private SessionFactory sessionFactory;
	
	public BlogDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	public void add(Blog entity) {
		getSession().save(entity);

	}

	@Override
	public void update(Blog entity) {
		getSession().update(entity);

	}

	@Override
	public void del(Blog entity) {
		getSession().delete(entity);

	}

	@Override
	public Blog getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return (Blog) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public Blog getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getAll(String sql) {
		Query<Blog> query = getSession().createQuery(sql);
		List<Blog> list = query.list();
		return list;
	}

}
