package com.libary.converter;

import org.springframework.stereotype.Component;

import com.libary.dto.AdminDTO;
import com.libary.entity.AdminEntity;
@Component
public class AdminConverter {
	public AdminEntity toEntity(AdminDTO dto) {
		AdminEntity entity = new AdminEntity();
		entity.setAccountName(dto.getAccountName());
		entity.setPassword(dto.getPassword());
		entity.setStatus(dto.getStatus());
		entity.setUserName(dto.getUserName());
		entity.setEmail(dto.getEmail());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setCreatedBy(dto.getCreatedBy());
		entity.setCreatedDate(dto.getCreatedDate());
		entity.setModifiedBy(dto.getModifiedBy());
		entity.setModifiedDate(dto.getModifiedDate());
		
		return entity;
	}
	public AdminEntity toEntity(AdminDTO dto,AdminEntity entity) {
		entity.setAccountName(dto.getAccountName());
		entity.setPassword(dto.getPassword());
		entity.setStatus(dto.getStatus());
		entity.setUserName(dto.getUserName());
		entity.setEmail(dto.getEmail());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setCreatedBy(dto.getCreatedBy());
		entity.setCreatedDate(dto.getCreatedDate());
		entity.setModifiedBy(dto.getModifiedBy());
		entity.setModifiedDate(dto.getModifiedDate());
		
		return entity;
	}
	public AdminDTO toDTO(AdminEntity entity) {
		AdminDTO dto = new AdminDTO();
		if(entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setAccountName(entity.getAccountName());
		dto.setPassword(entity.getPassword());
		dto.setStatus(entity.getStatus());
		dto.setUserName(entity.getUserName());
		dto.setEmail(entity.getEmail());
		dto.setPhoneNumber(entity.getPhoneNumber());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		
		return dto;
	}
}
