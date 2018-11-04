package com.mx.blog.ownerblog.service.impl;

import com.mx.blog.ownerblog.domain.BlogUser;
import com.mx.blog.ownerblog.service.BlogUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BlogUserServiceImplTest {
    @Autowired
    private BlogUserService blogUserService;

    @Test
    public void getOne(){
        BlogUser blogUser = blogUserService.findByUid(1);
        Assert.assertNotNull("用户为空",blogUser);
        log.info("[查询单个用户]:blogUser={}",blogUser.toString());
    }

    @Test
    public void save(){
        BlogUser blogUser=new BlogUser();
        //blogUser.setUid(12);
        blogUser.setUsername("嘻嘻");
        blogUser.setAge(21);
        blogUser.setAddress("广州");
        BlogUser bu = blogUserService.saveOne(blogUser);
        System.out.println(bu.getUid());
    }
}