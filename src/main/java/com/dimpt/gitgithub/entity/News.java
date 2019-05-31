package com.dimpt.gitgithub.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @ClassName:News
 * @Author:zhangmeng
 * @Date:2019/5/31 9:28
 * Description:TODO
 */

@ApiModel(value = "news",description = "新闻实体")
public class News {
    private Integer id;
    @ApiModelProperty(value = "新闻标题",required = false)
    private String tilte;

    @JsonProperty("content1")
    //@JsonIgnore
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "UTC")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date inputDate;

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News() {
    }

    public News(Integer id, String tilte, String content) {
        this.id = id;
        this.tilte = tilte;
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", tilte='" + tilte + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
