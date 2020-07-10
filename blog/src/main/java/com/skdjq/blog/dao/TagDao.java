package com.skdjq.blog.dao;

import com.skdjq.blog.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TagDao {
    int saveTag(Tag tag);

    Tag getTagById(Long id);

    List<Tag> getAllTag();

    List<Tag> getAdminTag();

    Tag getTagByName(String name);

    int updateTag(Tag tag);

    int deleteTag(Long id);

    List<Tag> getTagByString(String text);
}
