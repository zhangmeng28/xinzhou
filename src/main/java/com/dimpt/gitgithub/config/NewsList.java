package com.dimpt.gitgithub.config;

import com.dimpt.gitgithub.entity.News;
import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName:NewsList
 * @Author:zhangmeng
 * @Date:2019/5/31 14:38
 * Description:TODO
 */
@Repository
public class NewsList {
    private List<News> list;

    public List<News> getList() {
        return list;
    }

    public void setList(List<News> list) {
        this.list = list;
    }

    public NewsList() {
        News news1 = new News(1,"aaa","ccc");
        News news2 = new News(2,"aaa22","ccc22");
        News news3 = new News(3,"aaa33","ccc33");

        news1.setInputDate(new Date());

        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);
        this.setList(list);
    }

    @Override
    public String toString() {
        return "NewsList{" +
                "list=" + list +
                '}';
    }
}
