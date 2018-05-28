package com.hpeu.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hpeu.ssh.dao.Base.AttendanceDao;
import com.hpeu.ssh.entity.ApprovalScores;
import com.hpeu.ssh.entity.Attendance;

public class AttendanceDaoImpl implements AttendanceDao {
	
private SessionFactory sessionFactory;
	
	public AttendanceDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	public void add(Attendance entity) {
		getSession().save(entity);

	}

	@Override
	public void update(Attendance entity) {
		getSession().update(entity);

	}

	@Override
	public void del(Attendance entity) {
		getSession().delete(entity);

	}

	@Override
	public Attendance getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return (Attendance) getSession().createQuery(sql).setParameter("id", id).uniqueResult();
	}

	@Override
	public Attendance getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Attendance> getAll(String sql) {
		Query<Attendance> query = getSession().createQuery(sql);
		List<Attendance> list = query.list();
		return list;
	}

}
