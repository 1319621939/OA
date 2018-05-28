package com.hpeu.ssh.entity;

import java.util.Objects;

public class ProcessScores {
    private int psId;
    private int status;
    private int result;
    private ApprovalScores approvalId;
    private User approvalUser;


    public int getPsId() {
        return psId;
    }

    public void setPsId(int psId) {
        this.psId = psId;
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

	public ApprovalScores getApprovalId() {
		return approvalId;
	}

	public void setApprovalId(ApprovalScores approvalId) {
		this.approvalId = approvalId;
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
		result = prime * result + ((approvalId == null) ? 0 : approvalId.hashCode());
		result = prime * result + ((approvalUser == null) ? 0 : approvalUser.hashCode());
		result = prime * result + psId;
		result = prime * result + this.result;
		result = prime * result + status;
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
		ProcessScores other = (ProcessScores) obj;
		if (approvalId == null) {
			if (other.approvalId != null)
				return false;
		} else if (!approvalId.equals(other.approvalId))
			return false;
		if (approvalUser == null) {
			if (other.approvalUser != null)
				return false;
		} else if (!approvalUser.equals(other.approvalUser))
			return false;
		if (psId != other.psId)
			return false;
		if (result != other.result)
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProcessScores [psId=" + psId + ", status=" + status + ", result=" + result + ", approvalId="
				+ approvalId + ", approvalUser=" + approvalUser + "]";
	}
    
    

   
}
