package com.mx.blog.ownerblog.service;

import com.mx.blog.ownerblog.domain.BlogUser;

import java.util.List;

public interface BlogUserService {
    BlogUser findByUid(Integer uid);

    List<BlogUser> findAll();

    BlogUser saveOne(BlogUser blogUser);

    List<BlogUser> findAllWithPage(int page, int size);
}
