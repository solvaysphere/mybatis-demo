package com.hpuswl.mybatis.mapper;

import com.hpuswl.mybatis.entity.Blog;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BlogMapper {

    Blog selectBlog(@Param("id") Long id);

    void insert(Blog blog);

    @Select("select * from tb_blog where id=#{id}")
    Blog selectBlogById(@Param("id") Long id);
}
