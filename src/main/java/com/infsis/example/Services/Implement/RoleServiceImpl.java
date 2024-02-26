package com.infsis.example.Services.Implement;

import com.infsis.example.DTOs.RoleDTO;
import com.infsis.example.Models.Role;
import com.infsis.example.Services.RoleService;

import java.util.Optional;

public class RoleServiceImpl implements RoleService {
    @Override
    public Optional<RoleDTO> getRoleById(Integer roleId) {
        return Optional.empty();
    }

    @Override
    public RoleDTO saveRole(RoleDTO roleDTO) {
        return null;
    }

    @Override
    public RoleDTO updateRole(Integer roleId, RoleDTO roleDTO) {
        return null;
    }

    @Override
    public void delete(Integer roleId) {

    }

    private RoleDTO RoleToDto(Role role){
        RoleDTO roleDTO=new RoleDTO(
                role.getName()
        );
        return roleDTO;
    }

    private Role DtoToRole(RoleDTO roleDTO){
        Role role = new Role();

        role.setName(roleDTO.getName());

        return role;
    }
}
