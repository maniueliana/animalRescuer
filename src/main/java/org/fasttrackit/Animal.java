package org.fasttrackit;

public class Animal {

    private String name;
    private int age;
    private int health;
    private int happy;
    private String foodPrefered;
    private String hobby;

    public Animal(String name, int age, int health, int happy, String foodPrefered, String hobby) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.happy = happy;
        this.foodPrefered = foodPrefered;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHappy() {
        return happy;
    }

    public void setHappy(int happy) {
        this.happy = happy;
    }

    public String getFoodPrefered() {
        return foodPrefered;
    }

    public void setFoodPrefered(String foodPrefered) {
        this.foodPrefered = foodPrefered;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
