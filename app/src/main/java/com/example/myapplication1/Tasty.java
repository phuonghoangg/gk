package com.example.myapplication1;

public class Tasty {
    private String nameDonut;
    private String desDonut;
    private String price;
    private int imgDonut;

    public Tasty(String nameDonut, String desDonut, String price, int imgDonut) {
        this.nameDonut = nameDonut;
        this.desDonut = desDonut;
        this.price = price;
        this.imgDonut = imgDonut;
    }

    public String getNameDonut() {
        return nameDonut;
    }

    public void setNameDonut(String nameDonut) {
        this.nameDonut = nameDonut;
    }

    public String getDesDonut() {
        return desDonut;
    }

    public void setDesDonut(String desDonut) {
        this.desDonut = desDonut;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImgDonut() {
        return imgDonut;
    }

    public void setImgDonut(int imgDonut) {
        this.imgDonut = imgDonut;
    }
}
