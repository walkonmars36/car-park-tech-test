package org.example;

public class Main {
    public static void main(String[] args) {


        CarPark carPark = new CarPark(4, 8, 4);

        System.out.println("Welcome to the Car park, there are " + carPark.getTotalSpaces() + " spaces available.");

        System.out.println(carPark.getTotalCarSpaces() + " car spaces");
        System.out.println(carPark.getTotalVanSpaces() + " van spaces and");
        System.out.println(carPark.getTotalMotorcycleSpaces() + " motorcycle spaces");

    }


}