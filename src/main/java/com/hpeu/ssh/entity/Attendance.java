package com.hpeu.ssh.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class Attendance {
    private int attendanceId;
    private Date attendanceDate;
    private Timestamp morningTime;
    private Timestamp afternoonTime;
    private Timestamp nightTime;
    private int status;
    private User userId;

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public Timestamp getMorningTime() {
        return morningTime;
    }

    public void setMorningTime(Timestamp morningTime) {
        this.morningTime = morningTime;
    }

    public Timestamp getAfternoonTime() {
        return afternoonTime;
    }

    public void setAfternoonTime(Timestamp afternoonTime) {
        this.afternoonTime = afternoonTime;
    }

    public Timestamp getNightTime() {
        return nightTime;
    }

    public void setNightTime(Timestamp nightTime) {
        this.nightTime = nightTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((afternoonTime == null) ? 0 : afternoonTime.hashCode());
		result = prime * result + ((attendanceDate == null) ? 0 : attendanceDate.hashCode());
		result = prime * result + attendanceId;
		result = prime * result + ((morningTime == null) ? 0 : morningTime.hashCode());
		result = prime * result + ((nightTime == null) ? 0 : nightTime.hashCode());
		result = prime * result + status;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attendance other = (Attendance) obj;
		if (afternoonTime == null) {
			if (other.afternoonTime != null)
				return false;
		} else if (!afternoonTime.equals(other.afternoonTime))
			return false;
		if (attendanceDate == null) {
			if (other.attendanceDate != null)
				return false;
		} else if (!attendanceDate.equals(other.attendanceDate))
			return false;
		if (attendanceId != other.attendanceId)
			return false;
		if (morningTime == null) {
			if (other.morningTime != null)
				return false;
		} else if (!morningTime.equals(other.morningTime))
			return false;
		if (nightTime == null) {
			if (other.nightTime != null)
				return false;
		} else if (!nightTime.equals(other.nightTime))
			return false;
		if (status != other.status)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Attendance [attendanceId=" + attendanceId + ", attendanceDate=" + attendanceDate + ", morningTime="
				+ morningTime + ", afternoonTime=" + afternoonTime + ", nightTime=" + nightTime + ", status=" + status
				+ ", userId=" + userId + "]";
	}
    
    

  
}
