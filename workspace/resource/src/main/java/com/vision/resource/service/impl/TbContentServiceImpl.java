package com.vision.resource.service.impl;

import com.vision.resource.entity.TbContent;
import com.vision.resource.mapper.TbContentMapper;
import com.vision.resource.service.ITbContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ddd
 * @since 2020-01-08
 */
@Service
public class TbContentServiceImpl extends ServiceImpl<TbContentMapper, TbContent> implements ITbContentService {

    @Autowired
    private TbContentMapper tbContentMapper;
    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
