package com.toceansoft.permission.service;

import com.toceansoft.permission.entity.Resource;

import java.util.List;
import java.util.Set;

/**
 * <p>User: Narci Lee
 * <p>Date: 17-7-27
 * <p>Version: 1.0
 */
public interface ResourceService {


    public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll();

    /**
     * 得到资源对应的权限字符串
     * @param resourceIds
     * @return
     */
    Set<String> findPermissions(Set<Long> resourceIds);

    /**
     * 根据用户权限得到菜单
     * @param permissions
     * @return
     */
    List<Resource> findMenus(Set<String> permissions);
}
