package com.libary.dto;

public class AdminDTO extends AbstractDTO<AdminDTO>{
	private String AccountName;
	private String Password;
	private String Status;
	private String UserName;
	private String Email;
	private int PhoneNumber;
	private int PositionCode;
	private int AccessPermissionCode;
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
	public int getPositionCode() {
		return PositionCode;
	}
	public void setPositionCode(int positionCode) {
		PositionCode = positionCode;
	}
	public int getAccessPermissionCode() {
		return AccessPermissionCode;
	}
	public void setAccessPermissionCode(int accessPermissionCode) {
		AccessPermissionCode = accessPermissionCode;
	}
	
	
}
