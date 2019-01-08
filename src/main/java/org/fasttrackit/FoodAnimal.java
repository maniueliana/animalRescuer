package org.fasttrackit;

public class FoodAnimal {

    private String name;
    private int price;
    private int cantity;
    private String expirationDate;

    public FoodAnimal(String name, int price, int cantity, String expirationDate) {
        this.name = name;
        this.price = price;
        this.cantity = cantity;
        this.expirationDate = expirationDate;
    }

    public FoodAnimal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCantity() {
        return cantity;
    }

    public void setCantity(int cantity) {
        this.cantity = cantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
