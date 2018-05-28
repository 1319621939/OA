package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.ProcessInfoDao;
import com.hpeu.ssh.entity.ProcessInfo;
import com.hpeu.ssh.service.base.ProcessInfoService;

public class ProcessInfoServiceImpl implements ProcessInfoService {
	
	private ProcessInfoDao processInfoDao;

	@Override
	public void add(ProcessInfo entity) {
		// TODO Auto-generated method stub
		processInfoDao.add(entity);

	}

	@Override
	public void update(ProcessInfo entity) {
		// TODO Auto-generated method stub
		processInfoDao.update(entity);

	}

	@Override
	public void del(ProcessInfo entity) {
		// TODO Auto-generated method stub
		processInfoDao.del(entity);

	}

	@Override
	public ProcessInfo getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return processInfoDao.getEntity(sql, id);
	}

	@Override
	public ProcessInfo getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessInfo> getAll(String sql) {
		// TODO Auto-generated method stub
		return processInfoDao.getAll(sql);
	}

	public ProcessInfoDao getProcessInfoDao() {
		return processInfoDao;
	}

	public void setProcessInfoDao(ProcessInfoDao processInfoDao) {
		this.processInfoDao = processInfoDao;
	}
	
	

}
