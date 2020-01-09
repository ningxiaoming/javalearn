package com.vision.resource.mapper;

import com.vision.resource.entity.TbContent;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ddd
 * @since 2020-01-08
 */
@Repository
public interface TbContentMapper extends BaseMapper<TbContent> {

    List<TbContent> selectAll();

}
