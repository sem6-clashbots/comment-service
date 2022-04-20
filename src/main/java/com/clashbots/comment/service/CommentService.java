package com.clashbots.comment.service;

import com.clashbots.comment.entity.Comment;
import com.clashbots.comment.repository.CommentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        log.info("inside save comment method of CommentService");
        return commentRepository.save(comment);
    }

    public Comment findCommentById(Long commentId) {
        log.info("inside find comment by id method of CommentService");
        return commentRepository.findByCommentId(commentId);
    }
}
