package com.lqiuqiu.service.impl;

import com.lqiuqiu.dao.ContentMapper;
import com.lqiuqiu.entity.Content;
import com.lqiuqiu.service.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * Created by ${jie.chen} on 2016/7/14.
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Resource
    public ContentMapper contentMapper;

    @Override
    public List<Content> findContentList() {
        return contentMapper.findContentList();
    }

    @Override
    public int insertSelective(Content content) {
        return contentMapper.insertSelective(content);
    }
}
