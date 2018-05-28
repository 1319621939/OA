package com.hpeu.ssh.entity;

import java.util.Objects;

public class ProcessLeave {
    private int plId;
    private int orderValue;
    private int underway;
    private int status;
    private int result;
    private Leave leaveId;
    private User approvalUser;


    public int getPlId() {
        return plId;
    }

    public void setPlId(int plId) {
        this.plId = plId;
    }

    public int getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(int orderValue) {
        this.orderValue = orderValue;
    }

    public int getUnderway() {
        return underway;
    }

    public void setUnderway(int underway) {
        this.underway = underway;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

	public Leave getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Leave leaveId) {
		this.leaveId = leaveId;
	}

	

	public User getApprovalUser() {
		return approvalUser;
	}

	public void setApprovalUser(User approvalUser) {
		this.approvalUser = approvalUser;
	}

	@Override
	public String toString() {
		return "ProcessLeave [plId=" + plId + ", orderValue=" + orderValue + ", underway=" + underway + ", status="
				+ status + ", result=" + result + ", leaveId=" + leaveId + ", approvalUser=" + approvalUser + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((approvalUser == null) ? 0 : approvalUser.hashCode());
		result = prime * result + ((leaveId == null) ? 0 : leaveId.hashCode());
		result = prime * result + orderValue;
		result = prime * result + plId;
		result = prime * result + this.result;
		result = prime * result + status;
		result = prime * result + underway;
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
		ProcessLeave other = (ProcessLeave) obj;
		if (approvalUser == null) {
			if (other.approvalUser != null)
				return false;
		} else if (!approvalUser.equals(other.approvalUser))
			return false;
		if (leaveId == null) {
			if (other.leaveId != null)
				return false;
		} else if (!leaveId.equals(other.leaveId))
			return false;
		if (orderValue != other.orderValue)
			return false;
		if (plId != other.plId)
			return false;
		if (result != other.result)
			return false;
		if (status != other.status)
			return false;
		if (underway != other.underway)
			return false;
		return true;
	}

	
    
    

   
}
