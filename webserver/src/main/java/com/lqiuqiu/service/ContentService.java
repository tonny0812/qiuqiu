package com.lqiuqiu.service;

import com.lqiuqiu.entity.Content;

import java.util.List;

public interface ContentService {
    int insertSelective(Content content);

    List<Content> findContentList();
}
