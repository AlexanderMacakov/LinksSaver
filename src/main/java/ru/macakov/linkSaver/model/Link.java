package ru.macakov.linkSaver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.GeneratedValue;

@Document(collection = Link.COLLECTION_NAME)
public class Link {
    public static final String COLLECTION_NAME = "Links";

    private String tittle;
    private String description;
    private String url;

    public Link() {

    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descrption) {
        this.description = descrption;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
