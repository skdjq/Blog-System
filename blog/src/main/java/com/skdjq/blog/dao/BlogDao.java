package com.skdjq.blog.dao;

import com.skdjq.blog.dto.*;
import com.skdjq.blog.entity.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogDao {
    ShowBlog getBlogById(Long id);

    List<BlogQuery> getAllBlogQuery();

    int saveBlog(Blog blog);

    int deleteBlog(Long id);

    int updateBlog(ShowBlog showBlog);

    int saveBlogAndTag(BlogAndTag blogAndTag);

    int deleteBlogAndTag(Long blogId);

    List<BlogQuery> searchByTitleOrTypeOrRecommend(SearchBlog searchBlog);

    List<FirstPageBlog> getFirstPageBlog();

    List<RecommendBlog> getAllRecommendBlog();

    List<FirstPageBlog> getSearchBlog(String query);

    DetailedBlog getDetailedBlog(Long id);

    List<FirstPageBlog> getByTypeId(Long typeId);

    List<FirstPageBlog> getByTagId(Long tagId);
}
