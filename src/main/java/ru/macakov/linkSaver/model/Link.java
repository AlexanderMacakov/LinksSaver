package ru.macakov.linkSaver.model;

public class Link {

    private String tittle;
    private String descrption;
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

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
