package com.hpeu.ssh.service.impl;

import java.util.List;

import com.hpeu.ssh.dao.Base.AttendanceDao;
import com.hpeu.ssh.entity.Attendance;
import com.hpeu.ssh.service.base.AttendanceService;

public class AttendanceServiceImpl implements AttendanceService {
	
	private AttendanceDao attendanceDao;

	@Override
	public void add(Attendance entity) {
		// TODO Auto-generated method stub
		attendanceDao.add(entity);

	}

	@Override
	public void update(Attendance entity) {
		// TODO Auto-generated method stub
		attendanceDao.update(entity);

	}

	@Override
	public void del(Attendance entity) {
		// TODO Auto-generated method stub
		attendanceDao.del(entity);

	}

	@Override
	public Attendance getEntity(String sql, int id) {
		// TODO Auto-generated method stub
		return attendanceDao.getEntity(sql, id);
	}

	@Override
	public Attendance getEntity(String sql, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Attendance> getAll(String sql) {
		// TODO Auto-generated method stub
		return attendanceDao.getAll(sql);
	}

	public AttendanceDao getAttendanceDao() {
		return attendanceDao;
	}

	public void setAttendanceDao(AttendanceDao attendanceDao) {
		this.attendanceDao = attendanceDao;
	}
	
	

}
