package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.ProcessScoresDao;
import com.hpeu.ssh.entity.ProcessScores;
import com.hpeu.ssh.service.base.ProcessScoresService;

public class ProcessScoresServiceImpl implements ProcessScoresService {
	
	private ProcessScoresDao processScoresDao;

	@Override
	public void add(ProcessScores entity) {
		processScoresDao.add(entity);

	}

	@Override
	public void update(ProcessScores entity) {
		processScoresDao.update(entity);

	}

	@Override
	public void del(ProcessScores entity) {
		processScoresDao.del(entity);

	}

	@Override
	public ProcessScores getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return processScoresDao.getEntity(sql, id);
	}

	@Override
	public ProcessScores getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessScores> getAll(String sql) {
		// TODO Auto-generated method stub
		return processScoresDao.getAll(sql);
	}

	public ProcessScoresDao getProcessScoresDao() {
		return processScoresDao;
	}

	public void setProcessScoresDao(ProcessScoresDao processScoresDao) {
		this.processScoresDao = processScoresDao;
	}
	
	

}
