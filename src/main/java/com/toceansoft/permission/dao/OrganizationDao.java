package com.toceansoft.permission.dao;

import com.toceansoft.permission.entity.Organization;

import java.util.List;

/**
 * <p>Organization: Narci Lee
 * <p>Date: 17-7-27
 * <p>Version: 1.0
 */
public interface OrganizationDao {

    public Organization createOrganization(Organization organization);
    public Organization updateOrganization(Organization organization);
    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    List<Organization> findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);
}
