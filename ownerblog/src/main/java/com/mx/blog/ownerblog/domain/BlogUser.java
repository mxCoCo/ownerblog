package com.mx.blog.ownerblog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class BlogUser {
    @Id
    //Jpa自增必须设置此生成策略GenerationType.IDENTITY,不然save方法报错
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    private String username;
    private Integer age;
    private String address;
}