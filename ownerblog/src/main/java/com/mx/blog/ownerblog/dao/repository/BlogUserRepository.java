package com.mx.blog.ownerblog.dao.repository;

import com.mx.blog.ownerblog.domain.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogUserRepository extends JpaRepository<BlogUser,Integer>{
    BlogUser findByUid(Integer uid);
}
