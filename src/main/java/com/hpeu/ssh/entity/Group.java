package com.hpeu.ssh.entity;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

public class Group {
    private int groupId;
    private String groupName;
    private String batch;
    private String remark;
    private Timestamp createDate;
    private Timestamp updateDate;
    private User managerId;
 

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

	public User getManagerId() {
		return managerId;
	}

	public void setManagerId(User managerId) {
		this.managerId = managerId;
	}

	

	
    
    

   
}
