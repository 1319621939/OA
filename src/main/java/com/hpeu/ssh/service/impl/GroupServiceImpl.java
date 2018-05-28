package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.GroupDao;
import com.hpeu.ssh.entity.Group;
import com.hpeu.ssh.service.base.GroupService;

public class GroupServiceImpl implements GroupService {
	
	private GroupDao groupDao;

	@Override
	public void add(Group entity) {
		groupDao.add(entity);

	}

	@Override
	public void update(Group entity) {
		groupDao.update(entity);

	}

	@Override
	public void del(Group entity) {
		groupDao.del(entity);

	}

	@Override
	public Group getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return groupDao.getEntity(sql, id);
	}

	@Override
	public Group getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> getAll(String sql) {
		// TODO Auto-generated method stub
		return groupDao.getAll(sql);
	}

	public GroupDao getGroupDao() {
		return groupDao;
	}

	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
	}
	

}
