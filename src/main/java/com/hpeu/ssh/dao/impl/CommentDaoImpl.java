package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.CommentDao;
import com.hpeu.ssh.entity.ApprovalScores;
import com.hpeu.ssh.entity.Comment;

public class CommentDaoImpl implements CommentDao {
	
private SessionFactory sessionFactory;
	
	public CommentDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	public void add(Comment entity) {
		getSession().save(entity);

	}

	@Override
	public void update(Comment entity) {
		getSession().update(entity);

	}

	@Override
	public void del(Comment entity) {
		getSession().delete(entity);

	}

	@Override
	public Comment getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return (Comment) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public Comment getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getAll(String sql) {
		Query<Comment> query = getSession().createQuery(sql);
		List<Comment> list = query.list();
		return list;
	}

}
