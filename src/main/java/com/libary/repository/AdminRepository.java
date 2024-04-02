package com.libary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libary.entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Long>{

}
