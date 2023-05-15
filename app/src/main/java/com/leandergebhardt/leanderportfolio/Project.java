package com.leandergebhardt.leanderportfolio;

import java.io.Serializable;

public class Project implements Serializable {

    String name;
    String description;
    int image;

    public Project(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
