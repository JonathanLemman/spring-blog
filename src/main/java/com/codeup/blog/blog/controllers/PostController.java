package com.codeup.blog.blog.controllers;

import com.codeup.blog.blog.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String index(Model vModel){
        ArrayList<Post> postList = new ArrayList<>();
        postList.add(new Post(4, "Test Title 1", "Test body 1"));
        postList.add(new Post(5, "Test Title 2", "Test body 2"));
        vModel.addAttribute("posts", postList);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewIndividualPost(@PathVariable long id, Model vModel){
        Post newPost = new Post(id, "The Green Tree", "I have no clue what the title is all about!");
        vModel.addAttribute("post", newPost);
//        vModel.addAttribute("id", id);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showForm(){
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(@RequestParam String title, @RequestParam String body){
        return "create a new post";
    }

}
