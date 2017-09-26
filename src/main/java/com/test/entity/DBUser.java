package com.test.entity;

import java.io.Serializable;
import java.util.Date;

public class DBUser implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;
	private String userName;
	private String createdBy;
	private Date createdDate;

	public DBUser() {
		super();
	}

	public DBUser(int userId, String userName, String createdBy, Date createdDate) {
		this.userId = userId;
		this.userName = userName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
