package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.ScoresDao;
import com.hpeu.ssh.entity.Scores;
import com.hpeu.ssh.service.base.ScoresService;

public class ScoresServiceImpl implements ScoresService {
	
	private ScoresDao scoresDao ;

	@Override
	public void add(Scores entity) {
		scoresDao.add(entity);

	}

	@Override
	public void update(Scores entity) {
		scoresDao.update(entity);

	}

	@Override
	public void del(Scores entity) {
		scoresDao.del(entity);

	}

	@Override
	public Scores getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return scoresDao.getEntity(sql, id);
	}

	@Override
	public Scores getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Scores> getAll(String sql) {
		// TODO Auto-generated method stub
		return scoresDao.getAll(sql);
	}

	public ScoresDao getScoresDao() {
		return scoresDao;
	}

	public void setScoresDao(ScoresDao scoresDao) {
		this.scoresDao = scoresDao;
	}
	

}
