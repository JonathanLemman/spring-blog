package com.codeup.blog.blog.models;

import javax.persistence.*;

@Entity
public class PostImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String imageTitle;

    @Column(nullable = false, length = 1000)
    private String url;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public PostImage(){}

    public PostImage(String imageTitle, String url, Post post) {
        this.imageTitle = imageTitle;
        this.url = url;
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    //    id (typical primary key annotations)
//    image_title VARCHAR(100) NOT NULL
//    url VARCHAR(1000) NOT NULL - the url is for simple hot linking of images for now
//    post_id (a FK that will be created with the proper One-To-Many mapping)
}
