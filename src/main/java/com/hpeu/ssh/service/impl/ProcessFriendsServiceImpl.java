package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.ProcessFriendsDao;
import com.hpeu.ssh.entity.ProcessFriends;
import com.hpeu.ssh.service.base.ProcessFriendsService;

public class ProcessFriendsServiceImpl implements ProcessFriendsService {
	
	private ProcessFriendsDao processFriendsDao;

	@Override
	public void add(ProcessFriends entity) {
		processFriendsDao.add(entity);

	}

	@Override
	public void update(ProcessFriends entity) {
		processFriendsDao.update(entity);

	}

	@Override
	public void del(ProcessFriends entity) {
		processFriendsDao.del(entity);

	}

	@Override
	public ProcessFriends getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return processFriendsDao.getEntity(sql, id);
	}

	@Override
	public ProcessFriends getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProcessFriends> getAll(String sql) {
		// TODO Auto-generated method stub
		return processFriendsDao.getAll(sql);
	}

	public ProcessFriendsDao getProcessFriendsDao() {
		return processFriendsDao;
	}

	public void setProcessFriendsDao(ProcessFriendsDao processFriendsDao) {
		this.processFriendsDao = processFriendsDao;
	}
	
	

}
