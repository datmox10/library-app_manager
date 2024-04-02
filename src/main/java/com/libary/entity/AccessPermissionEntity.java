package com.libary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Access_Permission")
public class AccessPermissionEntity extends AbstractEntity{
	@Column(name ="AccessPermissionName")
	private String AccessPermissionName;
	
	@OneToOne(mappedBy = "AccessPermission")
	private AdminEntity admin;

	public String getAccessPermissionName() {
		return AccessPermissionName;
	}

	public void setAccessPermissionName(String accessPermissionName) {
		AccessPermissionName = accessPermissionName;
	}

	public AdminEntity getAdmin() {
		return admin;
	}

	public void setAdmin(AdminEntity admin) {
		this.admin = admin;
	}
	
	
}
