package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.ProcessLeaveDao;
import com.hpeu.ssh.entity.ProcessLeave;
import com.hpeu.ssh.service.base.ProcessLeaveService;

public class ProcessLeaveServiceImpl implements ProcessLeaveService {
	
	private ProcessLeaveDao processLeaveDao;

	@Override
	public void add(ProcessLeave entity) {
		processLeaveDao.add(entity);

	}

	@Override
	public void update(ProcessLeave entity) {
		processLeaveDao.update(entity);

	}

	@Override
	public void del(ProcessLeave entity) {
		processLeaveDao.del(entity);

	}

	@Override
	public ProcessLeave getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return processLeaveDao.getEntity(sql, id);
	}

	@Override
	public ProcessLeave getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessLeave> getAll(String sql) {
		// TODO Auto-generated method stub
		return processLeaveDao.getAll(sql);
	}

	public ProcessLeaveDao getProcessLeaveDao() {
		return processLeaveDao;
	}

	public void setProcessLeaveDao(ProcessLeaveDao processLeaveDao) {
		this.processLeaveDao = processLeaveDao;
	}
	
	

}
