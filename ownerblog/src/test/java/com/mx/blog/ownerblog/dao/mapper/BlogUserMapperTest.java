package com.mx.blog.ownerblog.dao.mapper;

import com.mx.blog.ownerblog.domain.BlogUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BlogUserMapperTest {

    @Autowired
    private BlogUserMapper blogUserMapper;

    @Test
    public void save(){
        /*BlogUser blogUser=new BlogUser();
        blogUser.setUid(12);
        blogUser.setUsername("哈哈");
        blogUser.setAge(22);
        blogUser.setAddress("广州");
        blogUserMapper.insert(blogUser);
        System.out.println(blogUser.getUsername());*/
        BlogUser blogUser=new BlogUser();
        //blogUser.setUid(12);
        blogUser.setUsername("哈哈");
        blogUser.setAge(22);
        blogUser.setAddress("广州");
        blogUserMapper.save(blogUser);
        System.out.println(blogUser.getUid());
    }
    @Test
    public void update(){
        BlogUser blogUser = blogUserMapper.selectById(12);
        blogUser.setUsername("傻子");
        blogUserMapper.update(blogUser);
    }
    @Test
    public void delete(){
        blogUserMapper.delete(14);
    }

    @Test
    public void selectAll(){
        List<BlogUser> blogUserList = blogUserMapper.selectAll();
        Assert.assertTrue(blogUserList.size()>0);
    }
}