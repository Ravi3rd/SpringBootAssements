package com.spring.Stduy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {
    private String name;
    @Id
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
