package com.vision.resource.service;

import com.vision.resource.entity.TbContent;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ddd
 * @since 2020-01-08
 */
public interface ITbContentService extends IService<TbContent> {
    List<TbContent> selectAll();

}
