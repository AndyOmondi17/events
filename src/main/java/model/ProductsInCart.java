package model;

public class ProductsInCart {

    private Products product;
    private int quantityMax;
    private double price;

    public ProductsInCart(Products product, int quantityMax, double price) {
        this.setProduct(product);
        this.setQuantityMax(quantityMax);
        this.setPrice(price);
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public int getQuantityMax() {
        return quantityMax;
    }

    public void setQuantityMax(int quantityMax) {
        this.quantityMax = quantityMax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}