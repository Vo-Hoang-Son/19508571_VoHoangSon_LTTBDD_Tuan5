package com.example.tuan5.model;

public class Product {
    private String hang ;
    private String name;
    private int image;
    private double gia;

    public String getHang() {
        return hang;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public double getGia() {
        return gia;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public Product(String name, String hang, int image, double gia) {
        this.hang = hang;
        this.name = name;
        this.image = image;
        this.gia = gia;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "hang='" + hang + '\'' +
                ", name='" + name + '\'' +
                ", image=" + image +
                ", gia=" + gia +
                '}';
    }
}
