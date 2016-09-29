package com.dmcokami.matok.adsv001.app.Model;

/**
 * Created by matok on 29/09/2016.
 */

public class AdsNews {

    public final int id;
    public final String title;
    public  final String subtitle;
    public final String description;
    public  final String autor;
    public  final String image;
    public final String linkpage;


    public AdsNews(int id, String title, String subtitle, String description, String autor, String image, String linkpage) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.autor = autor;
        this.image = image;
        this.linkpage = linkpage;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getImage() {
        return image;
    }

    public String getLinkpage() {
        return linkpage;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDescription() {
        return description;
    }
}
