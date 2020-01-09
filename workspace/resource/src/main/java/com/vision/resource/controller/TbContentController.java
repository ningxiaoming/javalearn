package com.vision.resource.controller;


import com.vision.resource.entity.TbContent;
import com.vision.resource.service.ITbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ddd
 * @since 2020-01-08
 */
@RestController
public class TbContentController {

    @Autowired
    private ITbContentService tbContentService;

    @RequestMapping("/qw")
    public List<TbContent> selectAll(){
        return tbContentService.selectAll();
    }

    @RequestMapping("/qq/ww")
    public List<TbContent> selectAll1(){
        return tbContentService.selectAll();
    }

}
