package com.codeup.blog.blog.controllers;

import com.codeup.blog.blog.models.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class viewAllPostsInJSONFormat {

    @GetMapping("/posts.json")
    public @ResponseBody
    List<Post> viewAllAdsInJSONFormat() {
        return userPosts.findAll();
    }

    @GetMapping("/posts/ajax")
    public String viewAllAdsWithAjax() {
        return "ads/ajax";
    }
}
