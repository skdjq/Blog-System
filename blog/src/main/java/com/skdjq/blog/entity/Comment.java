package com.skdjq.blog.entity;


import com.skdjq.blog.dto.DetailedBlog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 评论实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;

    private Date createTime;

    private Long blogId;
    private Long parentCommentId;
    private boolean adminComment;

    //回复评论
    private List<Comment> replyComments = new ArrayList<>();

    private Comment parentComment;

    private String parentNickname;

    private DetailedBlog blog;


}
