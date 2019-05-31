package com.dimpt.gitgithub.entity;

/**
 * @ClassName:News
 * @Author:zhangmeng
 * @Date:2019/5/31 9:28
 * Description:TODO
 */
public class News {
    private Integer id;
    private String tilte;
    private String content;
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
