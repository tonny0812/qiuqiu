package com.lqiuqiu.controller;

import com.alibaba.fastjson.JSONObject;
import com.lqiuqiu.entity.Content;
import com.lqiuqiu.service.ContentService;
import com.lqiuqiu.service.UserService;
import com.lqiuqiu.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private ContentService contentService ;

    @RequestMapping("/turnToWebSocketIndex")
    public String turnToWebSocketIndex(){
        return  "websocket/websocket" ;
    }

    @RequestMapping("/ueditor/getUeditorController")
    public String getUeditorController(){
        return  "ueditor/controller" ;
    }
    @RequestMapping("/getIndex")
    public String getIndex(){
        return  "ueditor/lindex" ;
    }
    /**
     * 加载聊天记录
     * @param response
     */
    @RequestMapping("/content_load")
    public void content_load(HttpServletResponse response){
        JSONObject jsonObject = new JSONObject() ;
        try {
            JSONObject jo = new JSONObject() ;
            List<Content> list = contentService.findContentList();
            jo.put("contents",list) ;
            jsonObject = CommonUtil.parseJson("1","操作成功",jo);
        }catch (Exception e){
            logger.error("操作异常",e);
            CommonUtil.parseJson("2","操作异常","");
        }
        CommonUtil.responseBuildJson(response,jsonObject);
    }
}
