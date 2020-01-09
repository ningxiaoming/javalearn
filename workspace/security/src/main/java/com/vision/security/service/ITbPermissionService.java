package com.vision.security.service;

import com.vision.security.entity.TbPermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author ddd
 * @since 2020-01-07
 */
public interface ITbPermissionService extends IService<TbPermission> {
    List<TbPermission> selectByUserId(Long userId);
}
