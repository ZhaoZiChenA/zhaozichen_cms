package org.dfxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.dfxy.model.SysRole;

/**
 * Mapper 接口
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
    //查询角色关联查询角色菜单
    SysRole findRoleAndMenu(Integer id);
    //根据id删除所有角色菜单
    void deleteRoleMenus(SysRole sysRole);
    //批量插入角色菜单
    void insertRoleMenus(SysRole sysRole);
}
