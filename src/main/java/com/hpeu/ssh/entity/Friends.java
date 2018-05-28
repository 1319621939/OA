package com.hpeu.ssh.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Friends {
    private int friendsId;
    private Timestamp createDate;
    private User applyUser;
    private User acceptUser;


    public int getFriendsId() {
        return friendsId;
    }

    public void setFriendsId(int friendsId) {
        this.friendsId = friendsId;
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
		result = prime * result + friendsId;
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
		Friends other = (Friends) obj;
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
		if (friendsId != other.friendsId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Friends [friendsId=" + friendsId + ", createDate=" + createDate + ", applyUser=" + applyUser
				+ ", acceptUser=" + acceptUser + "]";
	}
    
    

  
}
