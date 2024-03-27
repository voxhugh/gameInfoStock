package com.situ.entity;

import java.io.StringWriter;

public class Gms {
    private int id;
    private String name;
    private double price;
    private double lprice;
    private int lkrate;
    private long monline;
    private float avgtime;
    private String developer;
    private String publisher;


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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLprice() {
        return lprice;
    }

    public void setLprice(double lprice) {
        this.lprice = lprice;
    }

    public int getLkrate() {
        return lkrate;
    }

    public void setLkrate(int lkrate) {
        this.lkrate = lkrate;
    }

    public long getMonline() {
        return monline;
    }

    public void setMonline(long monline) {
        this.monline = monline;
    }

    public float getAvgtime() {
        return avgtime;
    }

    public void setAvgtime(float avgtime) {
        this.avgtime = avgtime;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Gms{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", lprice=" + lprice +
                ", lkrate=" + lkrate +
                ", monline=" + monline +
                ", avgtime=" + avgtime +
                ", developer='" + developer + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
