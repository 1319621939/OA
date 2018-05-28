package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.ApprovalScoresDao;
import com.hpeu.ssh.entity.ApprovalScores;
import com.hpeu.ssh.service.base.ApprovalScoresService;

public class ApprovalScoresServiceImpl implements ApprovalScoresService {
	
	private ApprovalScoresDao approvalScoresDao;

	@Override
	public void add(ApprovalScores entity) {
		approvalScoresDao.add(entity);;

	}

	@Override
	public void update(ApprovalScores entity) {
		approvalScoresDao.update(entity);

	}

	@Override
	public void del(ApprovalScores entity) {
		approvalScoresDao.del(entity);

	}

	@Override
	public ApprovalScores getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return approvalScoresDao.getEntity(sql, id);
	}

	@Override
	public ApprovalScores getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApprovalScores> getAll(String sql) {
		// TODO Auto-generated method stub
		return approvalScoresDao.getAll(sql);
	}

	public ApprovalScoresDao getApprovalScoresDao() {
		return approvalScoresDao;
	}

	public void setApprovalScoresDao(ApprovalScoresDao approvalScoresDao) {
		this.approvalScoresDao = approvalScoresDao;
	}
	
	

}
