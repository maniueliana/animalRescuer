package org.fasttrackit;

public class Rescuer {
    private String name;
    private int amount;

    public Rescuer(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void feed (Rescuer rescuer, Animal animal,FoodAnimal food)
    {
        System.out.println(rescuer.getName()+ " just gave some " + food.getName() + " to " + animal.getName()+ ".");
    }

    public void recreate (Rescuer rescuer, Animal animal, FreeTime activity)
    {
        System.out.println(rescuer.getName()+ " is " + activity.getName() + " with " + animal.getName()+ ".");
    }
}
