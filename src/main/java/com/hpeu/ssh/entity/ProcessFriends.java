package com.hpeu.ssh.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class ProcessFriends {
    private int pfId;
    private int status;
    private int result;
    private Timestamp createDate;
    private User applyUser;
    private User acceptUser;
  

    public int getPfId() {
        return pfId;
    }

    public void setPfId(int pfId) {
        this.pfId = pfId;
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

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

	public User getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(User applyUser) {
		this.applyUser = applyUser;
	}

	public User getAcceptUser() {
		return acceptUser;
	}

	public void setAcceptUser(User acceptUser) {
		this.acceptUser = acceptUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acceptUser == null) ? 0 : acceptUser.hashCode());
		result = prime * result + ((applyUser == null) ? 0 : applyUser.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + pfId;
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
		ProcessFriends other = (ProcessFriends) obj;
		if (acceptUser == null) {
			if (other.acceptUser != null)
				return false;
		} else if (!acceptUser.equals(other.acceptUser))
			return false;
		if (applyUser == null) {
			if (other.applyUser != null)
				return false;
		} else if (!applyUser.equals(other.applyUser))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (pfId != other.pfId)
			return false;
		if (result != other.result)
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProcessFriends [pfId=" + pfId + ", status=" + status + ", result=" + result + ", createDate="
				+ createDate + ", applyUser=" + applyUser + ", acceptUser=" + acceptUser + "]";
	}
    
    

  
}
