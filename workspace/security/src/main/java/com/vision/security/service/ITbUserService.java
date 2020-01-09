package com.vision.security.service;

import com.vision.security.entity.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author ddd
 * @since 2020-01-07
 */
public interface ITbUserService extends IService<TbUser> {

    TbUser getByUsername(String username);
}
