package com.libary.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libary.converter.AdminConverter;
import com.libary.dto.AdminDTO;
import com.libary.entity.AdminEntity;
import com.libary.repository.AdminRepository;
import com.libary.service.IAdminService;
@Service
public class AdminService  implements IAdminService{
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private AdminConverter adminConverter;

	@Override
	public List<AdminDTO> findAll() {
		// TODO Auto-generated method stub
		List<AdminDTO> result = new ArrayList<>();
		List<AdminEntity> entities = adminRepository.findAll();
		for (AdminEntity entity : entities) {
			AdminDTO dto = adminConverter.toDTO(entity);
			result.add(dto);
		}
		return result;
	}
	
}
