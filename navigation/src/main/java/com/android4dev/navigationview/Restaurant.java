package com.android4dev.navigationview;

/**
 * Created by Arpit Singhal on 10/25/2016.
 */

public class Restaurant {
    private int id;
    private String name;
    private String address;
private int thumbnail;


    public Restaurant(int id, String name, String address, int thumbnail) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.thumbnail = thumbnail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
