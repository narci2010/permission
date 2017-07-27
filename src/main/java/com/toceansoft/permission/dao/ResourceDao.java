package com.toceansoft.permission.dao;

import com.toceansoft.permission.entity.Resource;

import java.util.List;

/**
 * <p>Resource: Narci Lee
 * <p>Date: 17-7-27
 * <p>Version: 1.0
 */
public interface ResourceDao {

    public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll();

}
