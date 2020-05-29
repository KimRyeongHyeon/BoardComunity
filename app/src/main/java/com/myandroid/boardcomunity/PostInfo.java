package com.myandroid.boardcomunity;

import java.util.ArrayList;
import java.util.Date;

public class PostInfo {
    private String title;
    private ArrayList<String> contents;
    private String publisher;
    private Date createdAt;
    private String id;

    public PostInfo(String title, ArrayList<String> contents, String publisher, Date createAt, String id) {
        this.title = title;
        this.contents = contents;
        this.publisher = publisher;
        this.createdAt = createAt;
        this.id = id;
    }

    public PostInfo(String title, ArrayList<String> contents, String publisher, Date createAt) {
        this.title = title;
        this.contents = contents;
        this.publisher = publisher;
        this.createdAt = createAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createAt) {
        this.createdAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
