package com.infsis.example.Services;

import com.infsis.example.DTOs.RoleDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RoleService {
    Optional<RoleDTO> getRoleById(Integer roleId);
    RoleDTO saveRole (RoleDTO roleDTO);
    RoleDTO updateRole(Integer roleId, RoleDTO roleDTO);
    void delete(Integer roleId);
}
