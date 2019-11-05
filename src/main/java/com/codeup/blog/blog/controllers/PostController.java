package com.codeup.blog.blog.controllers;

import com.codeup.blog.blog.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    ArrayList<Post> postList;

    public PostController() {
        postList = new ArrayList<>();

        postList.add(new Post(1, "Test Title 1", "Test body 1"));
        postList.add(new Post(2, "Test Title 2", "Test body 2"));
        postList.add(new Post(3, "Test Title 3", "Test body 3"));
    }

    @GetMapping("/posts")
    public String index(Model vModel){
        vModel.addAttribute("posts", postList);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewIndividualPost(@PathVariable long id, Model vModel){
        vModel.addAttribute("post", postList.get((int)id-1));
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
