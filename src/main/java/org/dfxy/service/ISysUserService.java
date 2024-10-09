package org.dfxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.dfxy.model.SysUser;

/**
 * 服务类
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 根据id查询用户关联查询角色
     * @param userId
     * @return
     */
    SysUser findUserById(Integer userId);

    /**
     * 保存用户
     */
    void saveSysUser(SysUser sysUser);

}
