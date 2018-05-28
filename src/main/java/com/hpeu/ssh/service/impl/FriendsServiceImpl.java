package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.FriendsDao;
import com.hpeu.ssh.entity.Friends;
import com.hpeu.ssh.service.base.FriendsService;

public class FriendsServiceImpl implements FriendsService {
	
	private FriendsDao friendsDao;

	@Override
	public void add(Friends entity) {
		friendsDao.add(entity);

	}

	@Override
	public void update(Friends entity) {
		friendsDao.update(entity);

	}

	@Override
	public void del(Friends entity) {
		friendsDao.del(entity);

	}

	@Override
	public Friends getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return friendsDao.getEntity(sql, id);
	}

	@Override
	public Friends getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Friends> getAll(String sql) {
		// TODO Auto-generated method stub
		return friendsDao.getAll(sql);
	}

	public FriendsDao getFriendsDao() {
		return friendsDao;
	}

	public void setFriendsDao(FriendsDao friendsDao) {
		this.friendsDao = friendsDao;
	}
	
	

}
