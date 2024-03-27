package com.situ.entity;

public class Suppliers {
    private String publisher;
    private String developer;
    private int gmcount;
    private double avgprice;
    private int likes;

    public String getDeveloper() {
        return developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public int getGmcount() {
        return gmcount;
    }

    public void setGmcount(int gmcount) {
        this.gmcount = gmcount;
    }

    public double getAvgprice() {
        return avgprice;
    }

    public void setAvgprice(double avgprice) {
        this.avgprice = avgprice;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                "publiher='" + publisher + '\'' +
                ", developer='" + developer + '\'' +
                ", gmcount=" + gmcount +
                ", avgprice=" + avgprice +
                ", likes=" + likes +
                '}';
    }
}
