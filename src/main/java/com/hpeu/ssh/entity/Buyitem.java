package com.hpeu.ssh.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Buyitem {
    private int buyitemId;
    private String title;
    private String content;
    private String remark;
    private int status;
    private int result;
    private Timestamp createDate;
    private User applyUser;
    private User approvalUser;


    public int getBuyitemId() {
        return buyitemId;
    }

    public void setBuyitemId(int buyitemId) {
        this.buyitemId = buyitemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
		result = prime * result + ((applyUser == null) ? 0 : applyUser.hashCode());
		result = prime * result + ((approvalUser == null) ? 0 : approvalUser.hashCode());
		result = prime * result + buyitemId;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + this.result;
		result = prime * result + status;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Buyitem other = (Buyitem) obj;
		if (applyUser == null) {
			if (other.applyUser != null)
				return false;
		} else if (!applyUser.equals(other.applyUser))
			return false;
		if (approvalUser == null) {
			if (other.approvalUser != null)
				return false;
		} else if (!approvalUser.equals(other.approvalUser))
			return false;
		if (buyitemId != other.buyitemId)
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (result != other.result)
			return false;
		if (status != other.status)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Buyitem [buyitemId=" + buyitemId + ", title=" + title + ", content=" + content + ", remark=" + remark
				+ ", status=" + status + ", result=" + result + ", createDate=" + createDate + ", applyUser="
				+ applyUser + ", approvalUser=" + approvalUser + "]";
	}
    
    

  
}
