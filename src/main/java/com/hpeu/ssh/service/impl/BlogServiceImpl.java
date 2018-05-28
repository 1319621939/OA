package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.BlogDao;
import com.hpeu.ssh.entity.Blog;
import com.hpeu.ssh.service.base.BlogService;

public class BlogServiceImpl implements BlogService {
	
	private BlogDao blogDao;

	@Override
	public void add(Blog entity) {
		// TODO Auto-generated method stub
		blogDao.add(entity);
		
	}

	@Override
	public void update(Blog entity) {
		// TODO Auto-generated method stub
		blogDao.update(entity);
		
	}

	@Override
	public void del(Blog entity) {
		// TODO Auto-generated method stub
		blogDao.del(entity);
		
	}

	@Override
	public Blog getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return blogDao.getEntity(sql, id);
	}

	@Override
	public Blog getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getAll(String sql) {
		// TODO Auto-generated method stub
		return blogDao.getAll(sql);
	}

	public BlogDao getBlogDao() {
		return blogDao;
	}

	public void setBlogDao(BlogDao blogDao) {
		this.blogDao = blogDao;
	}
	
	
	
}
