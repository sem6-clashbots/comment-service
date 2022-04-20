package com.clashbots.comment.controller;

//import com.clashbots.comment.RabbitmqSender;
import com.clashbots.comment.entity.Comment;
import com.clashbots.comment.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
@Slf4j
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/")
    public Comment saveComment(@RequestBody Comment comment){
        log.info("inside save comment method of CommentController");
        return commentService.saveComment(comment);
    }

    @GetMapping("/{id}")
    public Comment findCommentById(@PathVariable("id") Long commentId){
        log.info("inside find comment by id method of CommentController");
        return commentService.findCommentById(commentId);
    }

//    private RabbitmqSender rabbitMqSender;
//    @Autowired
//    public CommentController(RabbitmqSender rabbitMqSender) {
//        this.rabbitMqSender = rabbitMqSender;
//    }

//    @GetMapping("/rabbitmq/contract/{id}")
//    public String testRabbitmqContract(@PathVariable("id") Long userId) {
//        log.info("inside find user by id with contract method of UserController");
//        rabbitMqSender.send(userId);
//        return "Message has been sent Successfully: " + userId;
//    }
}
