package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.ScoresDao;
import com.hpeu.ssh.entity.Scores;

public class ScoresDaoImpl implements ScoresDao {
	
	private SessionFactory sessionFactory;
	
	public ScoresDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(Scores entity) {
		getSession().save(entity);

	}

	@Override
	public void update(Scores entity) {
		getSession().update(entity);

	}

	@Override
	public void del(Scores entity) {
		getSession().delete(entity);

	}

	@Override
	public Scores getEntity(String sql, int id) {
		return (Scores) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public Scores getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Scores> getAll(String sql) {
		Query<Scores> query = getSession().createQuery(sql);
		List<Scores> list = query.list();
		return list;
	}

}
