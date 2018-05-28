package com.hpeu.ssh.entity;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

public class Comment {
    private int commentId;
    private String commentContent;
    private Timestamp createDate;
    private int isDel;
    private Blog blogId;
    private User userId;
    private Comment commentTag;


    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

	public Blog getBlogId() {
		return blogId;
	}

	public void setBlogId(Blog blogId) {
		this.blogId = blogId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Comment getCommentTag() {
		return commentTag;
	}

	public void setCommentTag(Comment commentTag) {
		this.commentTag = commentTag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blogId == null) ? 0 : blogId.hashCode());
		result = prime * result + ((commentContent == null) ? 0 : commentContent.hashCode());
		result = prime * result + commentId;
		result = prime * result + ((commentTag == null) ? 0 : commentTag.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + isDel;
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
		Comment other = (Comment) obj;
		if (blogId == null) {
			if (other.blogId != null)
				return false;
		} else if (!blogId.equals(other.blogId))
			return false;
		if (commentContent == null) {
			if (other.commentContent != null)
				return false;
		} else if (!commentContent.equals(other.commentContent))
			return false;
		if (commentId != other.commentId)
			return false;
		if (commentTag == null) {
			if (other.commentTag != null)
				return false;
		} else if (!commentTag.equals(other.commentTag))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (isDel != other.isDel)
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
		return "Comment [commentId=" + commentId + ", commentContent=" + commentContent + ", createDate=" + createDate
				+ ", isDel=" + isDel + ", blogId=" + blogId + ", userId=" + userId + ", commentTag=" + commentTag + "]";
	}
    
    

   
}
