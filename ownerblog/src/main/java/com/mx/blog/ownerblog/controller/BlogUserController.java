package com.mx.blog.ownerblog.controller;

import com.mx.blog.ownerblog.domain.BlogUser;
import com.mx.blog.ownerblog.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class BlogUserController {
    @Autowired
    private BlogUserService blogUserService;

    @RequestMapping("/one/{uid}")
    public BlogUser getOne(@PathVariable("uid") Integer uid){
        BlogUser blogUser = blogUserService.findByUid(uid);
        return blogUser;
    }

    @RequestMapping("/list")
    public List<BlogUser> list(){
        List<BlogUser> blogUserList = blogUserService.findAll();
        return blogUserList;
    }

    @RequestMapping("/listpage/{page}/{size}")
    public List<BlogUser> listpage(@PathVariable(name = "page") int page,
            @PathVariable(name = "size") int size){
        List<BlogUser> blogUserList = blogUserService.findAllWithPage(page,size);
        return blogUserList;
    }
}
