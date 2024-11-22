package com.webdevelopment.Unidad2.u2_examen.models;

public class Productos {
    private Long id;
    private String productName;
    private int stock;
    private float sellPrice;
    private float buyPrice;

    // Constructor por defecto (necesario para Jackson)
    public Productos() {
    }

    // Constructor con parámetros
    public Productos(Long id, String productName, int stock, float sellPrice, float buyPrice) {
        this.id = id;
        this.productName = productName;
        this.stock = stock;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    // Getters y setters estándar
    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(float buyPrice) {
        this.buyPrice = buyPrice;
    }
}
