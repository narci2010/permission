package com.toceansoft.permission.dao;

import com.toceansoft.permission.entity.Role;

import java.util.List;

/**
 * <p>User: Narci Lee
 * <p>Date: 17-7-27
 * <p>Version: 1.0
 */
public interface RoleDao {

    public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();
}
