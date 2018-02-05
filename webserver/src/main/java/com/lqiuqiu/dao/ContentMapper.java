package com.lqiuqiu.dao;

import com.lqiuqiu.entity.Content;

import java.util.List;

public interface ContentMapper {
    int deleteByPrimaryKey(Integer contentid);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Integer contentid);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);

    List<Content> findContentList();
}