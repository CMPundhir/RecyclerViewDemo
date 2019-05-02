package com.example.myapplication.model;

public class Data {
    String bName , pName;
    int img;
    double price;


    @Override
    public String toString() {
        return "Data{" +
                "bName='" + bName + '\'' +
                ", pName='" + pName + '\'' +
                ", img=" + img +
                ", price=" + price +
                '}';
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
