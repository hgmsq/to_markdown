package com.liangtengyu.markdown.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MD")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class MD implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    @Column(name = "TITLE")
    private String TITLE;

    @Column(name = "CONTEXT")
    private String CONTEXT;


    @Column(name = "PNAME")
    private String PNAME;



    @Column(name = "SAVE_PATH")
    private String savePath;

    @Column(name = "BLOG_URL")
    private String blogUrl;



    @Column(name = "CREATE_TIME")
    private Date createTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getCONTEXT() {
        return CONTEXT;
    }

    public void setCONTEXT(String CONTEXT) {
        this.CONTEXT = CONTEXT;
    }

    public String getPNAME() {
        return PNAME;
    }

    public void setPNAME(String PNAME) {
        this.PNAME = PNAME;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
