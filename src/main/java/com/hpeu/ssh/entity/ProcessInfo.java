package com.hpeu.ssh.entity;

import java.util.Objects;

public class ProcessInfo {
    private int plId;
    private int orderValue;
    private int underway;
    private int status;
    private int result;
    private ApprovalInfo aiId;
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

	public ApprovalInfo getAiId() {
		return aiId;
	}

	public void setAiId(ApprovalInfo aiId) {
		this.aiId = aiId;
	}

	public User getApprovalUser() {
		return approvalUser;
	}

	public void setApprovalUser(User approvalUser) {
		this.approvalUser = approvalUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aiId == null) ? 0 : aiId.hashCode());
		result = prime * result + ((approvalUser == null) ? 0 : approvalUser.hashCode());
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
		ProcessInfo other = (ProcessInfo) obj;
		if (aiId == null) {
			if (other.aiId != null)
				return false;
		} else if (!aiId.equals(other.aiId))
			return false;
		if (approvalUser == null) {
			if (other.approvalUser != null)
				return false;
		} else if (!approvalUser.equals(other.approvalUser))
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

	@Override
	public String toString() {
		return "ProcessInfo [plId=" + plId + ", orderValue=" + orderValue + ", underway=" + underway + ", status="
				+ status + ", result=" + result + ", aiId=" + aiId + ", approvalUser=" + approvalUser + "]";
	}
    
    

  
}
