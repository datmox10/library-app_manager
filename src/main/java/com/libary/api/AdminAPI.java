package com.libary.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libary.dto.AdminDTO;
import com.libary.service.IAdminService;

@CrossOrigin
@RestController
public class AdminAPI {
	
	@Autowired
	private IAdminService adminService;
	
	@GetMapping(value = "/show-admin")
	public List<AdminDTO> showAdmin() {
		return adminService.findAll();
	}
}
