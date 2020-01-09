package com.vision.security.mapper;

import com.vision.security.entity.TbPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author ddd
 * @since 2020-01-07
 */
@Repository
public interface TbPermissionMapper extends BaseMapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("userId")Long userId);
}
