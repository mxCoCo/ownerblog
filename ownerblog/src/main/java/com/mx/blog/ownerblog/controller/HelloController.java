package com.mx.blog.ownerblog.controller;

import com.mx.blog.ownerblog.domain.BlogUser;
import com.mx.blog.ownerblog.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private BlogUserService blogUserService;

    @RequestMapping("/test")
    public String test(Model model){
        List<BlogUser> blogUserList = blogUserService.findAll();
        model.addAttribute("size", blogUserList.size());
        return "test";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
