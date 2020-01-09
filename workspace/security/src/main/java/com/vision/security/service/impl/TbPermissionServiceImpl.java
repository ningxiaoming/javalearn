package com.vision.security.service.impl;

import com.vision.security.entity.TbPermission;
import com.vision.security.mapper.TbPermissionMapper;
import com.vision.security.service.ITbPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author ddd
 * @since 2020-01-07
 */
@Service
public class TbPermissionServiceImpl extends ServiceImpl<TbPermissionMapper, TbPermission> implements ITbPermissionService {

    @Autowired
    private TbPermissionMapper tbPermissionMapper;
    @Override
    public List<TbPermission> selectByUserId(Long userId) {

        return tbPermissionMapper.selectByUserId(userId);
    }
}
