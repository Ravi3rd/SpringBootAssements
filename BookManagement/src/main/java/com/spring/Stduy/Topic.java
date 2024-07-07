package com.spring.Stduy;

public class Topic {
    private String name;
    private int id;
    private String author;

    public Topic() {
    }

    public Topic(String name, int id, String author) {
        this.name = name;
        this.id = id;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
