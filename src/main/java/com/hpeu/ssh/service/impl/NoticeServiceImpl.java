package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.NoticeDao;
import com.hpeu.ssh.entity.Notice;
import com.hpeu.ssh.service.base.NoticeService;

public class NoticeServiceImpl implements NoticeService {
	
	private NoticeDao noticeDao;

	@Override
	public void add(Notice entity) {
		noticeDao.add(entity);

	}

	@Override
	public void update(Notice entity) {
		noticeDao.update(entity);

	}

	@Override
	public void del(Notice entity) {
		noticeDao.del(entity);

	}

	@Override
	public Notice getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return noticeDao.getEntity(sql, id);
	}

	@Override
	public Notice getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notice> getAll(String sql) {
		// TODO Auto-generated method stub
		return noticeDao.getAll(sql);
	}

	public NoticeDao getNoticeDao() {
		return noticeDao;
	}

	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}
	
	

}
