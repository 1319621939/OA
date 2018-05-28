package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.UserDao;
import com.hpeu.ssh.entity.User;
import com.hpeu.ssh.service.base.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	@Override
	public void add(User entity) {
		userDao.add(entity);

	}

	@Override
	public void update(User entity) {
		userDao.update(entity);

	}

	@Override
	public void del(User entity) {
		userDao.del(entity);

	}

	@Override
	public User getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return userDao.getEntity(sql, id);
	}

	@Override
	public User getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll(String sql) {
		// TODO Auto-generated method stub
		return userDao.getAll(sql);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
