package com.lenasquare.financehome.model;

import java.util.Date;

public class Category {
    int id;
    String img, data, title;
    Double total;

    public Category(int id, String img, String title, Double total, String data) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.total = total;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
