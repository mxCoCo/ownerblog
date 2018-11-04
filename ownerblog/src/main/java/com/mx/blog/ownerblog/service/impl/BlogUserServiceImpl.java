package com.mx.blog.ownerblog.service.impl;

import com.github.pagehelper.PageHelper;
import com.mx.blog.ownerblog.dao.mapper.BlogUserMapper;
import com.mx.blog.ownerblog.dao.repository.BlogUserRepository;
import com.mx.blog.ownerblog.domain.BlogUser;
import com.mx.blog.ownerblog.domain.BlogUserExample;
import com.mx.blog.ownerblog.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogUserServiceImpl implements BlogUserService {
    @Autowired
    private BlogUserRepository blogUserRepository;
    @Autowired
    private BlogUserMapper blogUserMapper;

    @Override
    public BlogUser findByUid(Integer uid) {
        return blogUserRepository.findByUid(uid);
    }

    @Override
    public List<BlogUser> findAll() {
        return blogUserRepository.findAll();
    }

    @Override
    public BlogUser saveOne(BlogUser blogUser) {
        return blogUserRepository.save(blogUser);
    }

    @Override
    public List<BlogUser> findAllWithPage(int page, int size) {
        PageHelper.startPage(page,size);
        return blogUserMapper.selectAll();
    }
}
