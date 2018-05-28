package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.LeaveDao;
import com.hpeu.ssh.entity.Leave;
import com.hpeu.ssh.service.base.LeaveService;

public class LeaveServiceImpl implements LeaveService {
	
	private LeaveDao leaveDao;

	@Override
	public void add(Leave entity) {
		leaveDao.add(entity);

	}

	@Override
	public void update(Leave entity) {
		leaveDao.update(entity);

	}

	@Override
	public void del(Leave entity) {
		leaveDao.del(entity);

	}

	@Override
	public Leave getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return leaveDao.getEntity(sql, id);
	}

	@Override
	public Leave getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Leave> getAll(String sql) {
		// TODO Auto-generated method stub
		return leaveDao.getAll(sql);
	}

	public LeaveDao getLeaveDao() {
		return leaveDao;
	}

	public void setLeaveDao(LeaveDao leaveDao) {
		this.leaveDao = leaveDao;
	}
	
	

}
