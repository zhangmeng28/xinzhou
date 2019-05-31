package com.dimpt.gitgithub.controller;

import com.dimpt.gitgithub.entity.News;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:NewsController
 * @Author:zhangmeng
 * @Date:2019/5/31 9:03
 * Description:TODO
 */
@RestController
@RequestMapping(value = "news")
public class NewsController {
    @GetMapping(value = "getAll")
    public List<News> getAll(){
        News news1 = new News(1,"aaa","ccc");
        News news2 = new News(2,"aaa22","ccc22");
        News news3 = new News(3,"aaa33","ccc33");
        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);
        return list;
    }
}
