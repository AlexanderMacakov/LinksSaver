package ru.macakov.linkSaver.model;

public class Link {

    private String tittle;
    private String description;
    private String url;

    public Link() {

    }


    public Link(String tittle, String url) {
        this.tittle = tittle;
        this.url = url;
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
