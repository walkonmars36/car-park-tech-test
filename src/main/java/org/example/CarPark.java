package org.example;

import java.util.ArrayList;

public class CarPark {

private int totalSpaces;

private int totalVanSpaces;

private int totalCarSpaces;

private int totalMotorcycleSpaces;

private final ArrayList<String> vanSpacesAvailable = new ArrayList<String>();

private final ArrayList<String> carSpacesAvailable = new ArrayList<String>();

private final ArrayList<String> motorcycleSpacesAvailable = new ArrayList<String>();

private final String[] vehicleType = {"car", "van", "motorcycle"};


    public CarPark( int totalVanSpaces, int totalCarSpaces, int totalMotorcycleSpaces) {
        this.totalSpaces = totalVanSpaces + totalCarSpaces + totalMotorcycleSpaces;
        this.totalVanSpaces = totalVanSpaces;
        this.totalCarSpaces = totalCarSpaces;
        this.totalMotorcycleSpaces = totalMotorcycleSpaces;
    }

// Tell us how many total spots are in the parking lot
    public int getTotalSpaces() {
        return totalSpaces;
    }

//    total van spaces
    public int getTotalVanSpaces() {
        return totalVanSpaces;
    }

//    total car spaces
    public int getTotalCarSpaces() {
        return totalCarSpaces;
    }

//    total motorcycle spaces
    public int getTotalMotorcycleSpaces() {
        return totalMotorcycleSpaces;
    }


//    get the vehicleType {car, van, motorcycle}
    public String[] getVehicleType() {return vehicleType;}



//      loop over getVehicle type
//      if car then check number of car spaces available etc...

    public void getAvailableSpace() {

        for (int i = 0; i < vehicleType.length; i++) {
            if(vehicleType[i] == "car") {
//                return something
            } else if (vehicleType[i] == "van") {
//                return something
            } else  {
//                return something
            }

        }
    }

//      parking method




}
