package com.skdjq.blog.Service;

import com.skdjq.blog.entity.Tag;

import java.util.List;

public interface TagService {
    int saveTag(Tag tag);

    Tag getTagById(Long id);

    List<Tag> getAllTag();

    List<Tag> getAdminTag();

    Tag getTagByName(String name);

    int updateTag(Tag tag);

    int deleteTag(Long id);

    List<Tag> getTagByString(String text);
}
