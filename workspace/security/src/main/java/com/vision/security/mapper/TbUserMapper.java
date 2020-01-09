package com.vision.security.mapper;

import com.vision.security.entity.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author liuwenxu
 * @since 2020-01-07
 */
@Repository
public interface TbUserMapper extends BaseMapper<TbUser> {
    TbUser getByUsername(@Param("username") String username);
}
