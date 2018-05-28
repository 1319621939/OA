package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.BuyitemDao;
import com.hpeu.ssh.entity.Buyitem;
import com.hpeu.ssh.service.base.BuyitemService;

public class BuyitemServiceImpl implements BuyitemService {
	
	private BuyitemDao buyitemDao;


	public BuyitemDao getBuyitemDao() {
		return buyitemDao;
	}

	public void setBuyitemDao(BuyitemDao buyitemDao) {
		this.buyitemDao = buyitemDao;
	}

	@Override
	public void add(Buyitem entity) {
		buyitemDao.add(entity);
		
	}

	@Override
	public void update(Buyitem entity) {
		buyitemDao.update(entity);
		
	}

	@Override
	public void del(Buyitem entity) {
		buyitemDao.del(entity);
		
	}

	@Override
	public Buyitem getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return buyitemDao.getEntity(sql, id);
	}

	@Override
	public Buyitem getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buyitem> getAll(String sql) {
		// TODO Auto-generated method stub
		return buyitemDao.getAll(sql);
	}
	

}
