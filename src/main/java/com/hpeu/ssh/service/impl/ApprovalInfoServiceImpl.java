package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.ApprovalInfoDao;
import com.hpeu.ssh.entity.ApprovalInfo;
import com.hpeu.ssh.service.base.ApprovalInfoService;

public class ApprovalInfoServiceImpl implements ApprovalInfoService {
	
	private ApprovalInfoDao approvalInfoDao;

	@Override
	public void add(ApprovalInfo entity) {
		approvalInfoDao.add(entity);

	}

	@Override
	public void update(ApprovalInfo entity) {
		// TODO Auto-generated method stub
		approvalInfoDao.update(entity);

	}

	@Override
	public void del(ApprovalInfo entity) {
		// TODO Auto-generated method stub
		approvalInfoDao.del(entity);

	}

	@Override
	public ApprovalInfo getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return approvalInfoDao.getEntity(sql, id);
	}

	@Override
	public ApprovalInfo getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApprovalInfo> getAll(String sql) {
		// TODO Auto-generated method stub
		return approvalInfoDao.getAll(sql);
	}

	public ApprovalInfoDao getApprovalInfoDao() {
		return approvalInfoDao;
	}

	public void setApprovalInfoDao(ApprovalInfoDao approvalInfoDao) {
		this.approvalInfoDao = approvalInfoDao;
	}
	
	

}
