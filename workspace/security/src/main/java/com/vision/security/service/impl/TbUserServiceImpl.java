package com.vision.security.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vision.security.entity.TbUser;
import com.vision.security.mapper.TbUserMapper;
import com.vision.security.service.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author ddd
 * @since 2020-01-07
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;


    @Override
    public TbUser getByUsername(String username) {
        System.out.println(username);
        return tbUserMapper.getByUsername(username);
/*        QueryWrapper qw = new QueryWrapper();
        qw.eq("username",username);
        return tbUserMapper.selectOne(qw);*/
    }
}
