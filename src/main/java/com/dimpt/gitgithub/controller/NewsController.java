package com.dimpt.gitgithub.controller;

import com.alibaba.fastjson.JSONObject;
import com.dimpt.gitgithub.config.NewsList;
import com.dimpt.gitgithub.entity.News;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
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
@Api(tags = "新闻系统-新闻管理模块API")
public class NewsController {

    @Autowired
    private NewsList newsList;

    @GetMapping(value = "getAll")
    @ApiOperation(value = "获取新闻列表")
    public List<News> getAll(){
        return newsList.getList();
    }

    //Restful开发模式
    @GetMapping(value = "detail/{id}")
    @ApiOperation(value = "获取新闻详情")
    @ApiImplicitParam(name = "id",value = "新闻编号",required = true,dataType = "String")
    public News getOne(@PathVariable(name = "id") String id){
        News news = newsList.getList().get(Integer.parseInt(id));
        return news;
    }

    //新增新闻
    @PostMapping(value = "insert")
    public void addNews(@RequestBody @ApiParam(value = "新闻对象",required = true) News news){
        newsList.getList().add(news);
        System.out.println(newsList.getList());
    }

    //修改新闻
    @PutMapping(value = "update")
    public void updateNews(@RequestBody News news){
        newsList.getList().set(1,news);
        System.out.println(newsList.getList());
    }

    //修改新闻
    @PutMapping(value = "update/{id}")
    @ApiOperation(value = "修改新闻")
    @ApiImplicitParams({@ApiImplicitParam(name = "news" ,value = "新闻对象",dataType = "News"),
            @ApiImplicitParam(name = "id",value = "新闻编号",dataType = "int")})
    public void updateNews(@RequestBody News news,
                           @PathVariable(name = "id") int id){
        news.setId(id);
        newsList.getList().set(1,news);
        System.out.println(newsList.getList());
    }

    @PostMapping(value = "json")
    public void getJson(@RequestBody JSONObject jsonObject){
        System.out.println(jsonObject.getString("userid"));
        System.out.println(jsonObject.getInteger("age"));
        System.out.println(jsonObject.getObject("ids",List.class).get(0));
    }
}
