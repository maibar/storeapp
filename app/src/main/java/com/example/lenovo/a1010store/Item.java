package com.example.lenovo.a1010store;

import android.media.Image;

import java.util.Locale;

public class Item {
    private String Title;
    private String Category;
    private String Price;
    private int Imgep;


    public Item(){

    }


    public Item(String title, String category, String price, int imgep){

        Title = title;
        Category = category;
        Price = price;
        Imgep = imgep;

    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getPrice() {
        return Price;
    }

    public int getImgep() {
        return Imgep;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setImgep(int imgep) {
        Imgep = imgep;
    }
}
