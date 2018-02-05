package com.lqiuqiu.entity;

public class Content {
    private Integer contentid;

    private String contentname;

    private String content;

    private String createdate;

    public Content(Integer contentid, String contentname, String content, String createdate) {
        this.contentid = contentid;
        this.contentname = contentname;
        this.content = content;
        this.createdate = createdate;
    }

    public Content() {
        super();
    }

    public Integer getContentid() {
        return contentid;
    }

    public void setContentid(Integer contentid) {
        this.contentid = contentid;
    }

    public String getContentname() {
        return contentname;
    }

    public void setContentname(String contentname) {
        this.contentname = contentname == null ? null : contentname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }
}