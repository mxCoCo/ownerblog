package com.mx.blog.ownerblog.dao.mapper;

import com.mx.blog.ownerblog.domain.BlogUser;
import com.mx.blog.ownerblog.domain.BlogUserExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

public interface BlogUserMapper {
    int countByExample(BlogUserExample example);

    int deleteByExample(BlogUserExample example);

    int insert(BlogUser record);

    int insertSelective(BlogUser record);

    List<BlogUser> selectByExample(BlogUserExample example);

    int updateByExampleSelective(@Param("record") BlogUser record, @Param("example") BlogUserExample example);

    int updateByExample(@Param("record") BlogUser record, @Param("example") BlogUserExample example);

    /**
     * 添加操作，返回新增元素的 ID
     * @param blogUser
     */
    @Insert("insert into blog_user(username, age, address) values(#{username},#{age},#{address})")
    @Options(useGeneratedKeys = true, keyColumn = "uid", keyProperty = "uid")
    void save(BlogUser blogUser);

    /**
     * 更新操作
     * @param blogUser
     * @return 受影响的行数
     */
    @Update("update blog_user set username=#{username},age=#{age} where uid=#{uid}")
    Long update(BlogUser blogUser);
    /**
     * 删除操作
     * @param uid
     * @return 受影响的行数
     */
    @Delete("delete from blog_user where uid=#{uid}")
    Long delete(@Param("uid") Integer uid);

    /**
     * 查询所有
     * @return
     */
    @Select("select uid, username, age, address from blog_user")
    List<BlogUser> selectAll();

    /**
     * 根据主键查询单个
     * @param uid
     * @return
     */
    @Select("select uid, username, age, address from blog_user where uid=#{uid}")
    BlogUser selectById(@Param("uid") Integer uid);

}