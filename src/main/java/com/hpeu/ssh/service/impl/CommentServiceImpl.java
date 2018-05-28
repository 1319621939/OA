package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.CommentDao;
import com.hpeu.ssh.entity.Comment;
import com.hpeu.ssh.service.base.CommentService;

public class CommentServiceImpl implements CommentService {
	
	private CommentDao commentDao;

	@Override
	public void add(Comment entity) {
		// TODO Auto-generated method stub
		commentDao.add(entity);

	}

	@Override
	public void update(Comment entity) {
		// TODO Auto-generated method stub
		commentDao.update(entity);

	}

	@Override
	public void del(Comment entity) {
		// TODO Auto-generated method stub
		commentDao.del(entity);

	}

	@Override
	public Comment getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return commentDao.getEntity(sql, id);
	}

	@Override
	public Comment getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getAll(String sql) {
		// TODO Auto-generated method stub
		return commentDao.getAll(sql);
	}

	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
	
	

}
