package org.example;

public  class Vehicle {



    private int vehicleSize;

    private String vehicleType;

    private String vehicleReg;

    private boolean isParked;

    public Vehicle( int vehicleSize, String vehicleType, String vehicleReg) {

        this.vehicleSize = vehicleSize;
        this.vehicleType = vehicleType;
        this.vehicleReg = vehicleReg;
        this.isParked = false;
    }


    public boolean isParked() {
        return isParked;
    }

    public void setParked(boolean parked) {
        isParked = parked;
    }

    public int getVehicleSize() {
        return vehicleSize;
    }

    public String getVehicleReg() {
        return vehicleReg;
    }

    public String getVehicleType() {return vehicleType;}

}
