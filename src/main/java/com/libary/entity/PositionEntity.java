package com.libary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Position")
public class PositionEntity extends AbstractEntity{
	
	@Column(name ="PositionName")
	private String PositionName;
	
	@OneToOne(mappedBy = "position")
	private AdminEntity admin;

	public String getPositionName() {
		return PositionName;
	}

	public void setPositionName(String positionName) {
		PositionName = positionName;
	}

	public AdminEntity getAdmin() {
		return admin;
	}

	public void setAdmin(AdminEntity admin) {
		this.admin = admin;
	}
	
	
}
