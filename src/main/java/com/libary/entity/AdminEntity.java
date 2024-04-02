package com.libary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class AdminEntity extends AbstractEntity{
	
	@Column(name = "AccountName")
	private String AccountName;
	
	@Column(name = "Password")
	private String Password;
	
	@Column(name = "Status")
	private String Status;
	
	@Column(name = "UserName")
	private String UserName;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "PhoneNumber")
	private int PhoneNumber;
	
	@OneToOne
	@JoinColumn(name = "PositionCode",referencedColumnName = "id")
	private PositionEntity position;
	
	@OneToOne
	@JoinColumn(name = "AccessPermissionCode",referencedColumnName = "id")
	private AccessPermissionEntity AccessPermission;

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public PositionEntity getPosition() {
		return position;
	}

	public void setPosition(PositionEntity position) {
		this.position = position;
	}

	public AccessPermissionEntity getAccessPermission() {
		return AccessPermission;
	}

	public void setAccessPermission(AccessPermissionEntity accessPermission) {
		AccessPermission = accessPermission;
	}
	
	
}
