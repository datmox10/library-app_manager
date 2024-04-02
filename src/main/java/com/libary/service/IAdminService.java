package com.libary.service;

import java.util.List;

import com.libary.dto.AdminDTO;

public interface IAdminService {
	List<AdminDTO> findAll();
}
