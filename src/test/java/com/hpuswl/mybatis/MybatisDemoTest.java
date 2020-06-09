package com.hpuswl.mybatis;

import com.hpuswl.mybatis.entity.Blog;
import com.hpuswl.mybatis.mapper.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
public class MybatisDemoTest {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        System.out.println(sqlSessionFactory);
        try(SqlSession session = sqlSessionFactory.openSession()){
           /* Blog blog = new Blog();
            blog.setId(1L);
            blog.setTitle("Hello Mybatis");
            session.insert("com.hpuswl.mybatis.mapper.BlogMapper.insert", blog);
            session.commit();*/
            /*Blog blog = session.selectOne("com.hpuswl.mybatis.mapper.BlogMapper.selectBlog", 1L);
            System.out.println(blog);*/
            BlogMapper mapper = session.getMapper(BlogMapper.class);
           /* Blog blog = new Blog();
            blog.setId(2L);
            blog.setTitle("Mybatis Good !");
            mapper.insert(blog);
            session.commit();*/
            /*Blog blog = mapper.selectBlog(2L);
            System.out.println(blog);*/

            Blog blog = mapper.selectBlogById(2L);
            System.out.println(blog);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
