package com.hpeu.ssh.entity;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

public class Blog {
    private int blogId;
    private String blogTitle;
    private String blogContent;
    private Timestamp createDate;
    private Timestamp updateDate;
    private User userId;
    private int isDel;


    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
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

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
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
		result = prime * result + ((blogContent == null) ? 0 : blogContent.hashCode());
		result = prime * result + blogId;
		result = prime * result + ((blogTitle == null) ? 0 : blogTitle.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + isDel;
		result = prime * result + ((updateDate == null) ? 0 : updateDate.hashCode());
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
		Blog other = (Blog) obj;
		if (blogContent == null) {
			if (other.blogContent != null)
				return false;
		} else if (!blogContent.equals(other.blogContent))
			return false;
		if (blogId != other.blogId)
			return false;
		if (blogTitle == null) {
			if (other.blogTitle != null)
				return false;
		} else if (!blogTitle.equals(other.blogTitle))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (isDel != other.isDel)
			return false;
		if (updateDate == null) {
			if (other.updateDate != null)
				return false;
		} else if (!updateDate.equals(other.updateDate))
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
		return "Blog [blogId=" + blogId + ", blogTitle=" + blogTitle + ", blogContent=" + blogContent + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", userId=" + userId + ", isDel=" + isDel + "]";
	}
    
    

}
