package com.codeup.blog.blog.controllers;

import com.codeup.blog.blog.models.Post;
import com.codeup.blog.blog.repository.PostRepository;
import com.codeup.blog.blog.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;

    public PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }

    @GetMapping("/posts")
    public String index(Model vModel){
        vModel.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String viewIndividualPost(@PathVariable long id, Model vModel){
        vModel.addAttribute("post", postDao.getOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showForm(){
        return "posts/create";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(@RequestParam String title, @RequestParam String body){
        return "create a new post";
    }




    @GetMapping("/posts/{id}/edit")
    public String editForm(@PathVariable long id){
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String editPost(@PathVariable long id, @RequestParam(name = "title") String title, @RequestParam(name = "body") String body){
        Post oldPost = postDao.getOne(id);
        oldPost.setTitle(title);
        oldPost.setTitle(body);
        postDao.save(oldPost);
        return "redirect:/posts";
    }



//    @GetMapping("/ads/{id}/edit")
//    public String edit(@PathVariable long id, Model viewModel) {
//        viewModel.addAttribute("ad", adDao.getOne(id));
//        return "ads/edit";
//    }
//
//    @PostMapping("/ads/{id}/edit")
//    public String update(@PathVariable long id, @RequestParam String title, @RequestParam String description) {
//        Ad oldAd = adDao.getOne(id);
//        oldAd.setTitle(title);
//        oldAd.setDescription(description);
//        adDao.save(oldAd);
//        return "redirect:/ads/" + id;
//    }




//    @PostMapping("/posts/delete")
//    public String deletePost(@RequestParam(name = "post") long id){
//        postDao.deleteById(id);
//        return "redirect:/posts";
//    }

    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable long id){
        postDao.deleteById(id);
        return "redirect:/posts";
    }


    @GetMapping("/posts/{id}/history")
    public String historyOfPost(@PathVariable long id, Model vModel){
        vModel.addAttribute("post", postDao.getOne(id));
        return "posts/history";
    }


}
