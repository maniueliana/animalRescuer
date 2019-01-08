package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //{Rescuer firstRescuer = new Rescuer();
//        firstRescuer.name = "Eduard";
//         firstRescuer.amount = 50;
//
//        Animal firstAnimal = new Animal();
//        firstAnimal.name = "Dodo";
//
//        Vet firstVet = new Vet();
//        firstVet.name = "Muresan";
//        firstVet.specialty = "cardio";
//
//        System.out.println(firstVet.name);
//
//        System.out.println(  );

        Rescuer rescuer = new Rescuer("John", 100);
        Animal animal = new Animal("Chaika", 4, 8, 9, "milk", "jumping");
        FoodAnimal food = new FoodAnimal("Chappy", 20, 5, "31122019");

        rescuer.feed(rescuer, animal, food);

        Rescuer rescuer1 = new Rescuer("Mary", 200);
        Animal animal1 = new Animal("Lady", 2, 9, 8, "bonnes", "playing");
        FreeTime activity = new FreeTime("running");

        rescuer.recreate(rescuer1, animal1, activity );
    }
    }
