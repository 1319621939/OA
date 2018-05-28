package com.hpeu.ssh.service;

import java.util.List;

public interface BaseService<T> {

	/**
	 * 添加实体对象
	 * yfly <br>
	 * add <br>
	 * 2018-04-24 09:16:16<br>
	 * @param sql
	 * @param entity
	 */
	void add(T entity);
	
	/**
	 * 更新实体对象
	 * yfly <br>
	 * update <br>
	 * 2018-04-24 09:16:32<br>
	 * @param sql
	 * @param entity
	 */
	void update(T entity);
	
	/**
	 * 删除
	 * yfly <br>
	 * del <br>
	 * 2018-04-24 09:16:49<br>
	 * @param sql
	 * @param id
	 */
	void del(T entity);
	
	/**
	 * 根据id查询单个
	 * yfly <br>
	 * getEntity <br>
	 * 2018-04-24 09:16:58<br>
	 * @param sql
	 * @param id
	 * @return
	 */
	T getEntity(String sql, int id);
	
	T getEntity(String sql, String name);
	
	/**
	 * 查询所有
	 * yfly <br>
	 * getAll <br>
	 * 2018-04-24 09:17:10<br>
	 * @param sql
	 * @return
	 */
	List<T> getAll(String sql);
}
