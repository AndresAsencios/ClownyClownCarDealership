package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.inventory = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }
    public ArrayList<Vehicle> getVehiclesByMake(String make) {
        ArrayList<Vehicle> matchingVehicle = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make)) {
                matchingVehicle.add(vehicle);
            }
        }
        return matchingVehicle;

    }

    public ArrayList<Vehicle> getVehiclesByYear(int year) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() == year) {
                matchingVehicles.add(vehicle);
            }
        }
        return matchingVehicles;
    }

    public ArrayList<Vehicle> getVehicleByColor(String color) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                matchingVehicles.add(vehicle);
            }
        }
        return matchingVehicles;
    }

    public ArrayList<Vehicle> getVehicleByModel(String model) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getModel().equalsIgnoreCase(model)) {
                matchingVehicles.add(vehicle);
            }
        }
        return matchingVehicles;
    }

    public ArrayList<Vehicle> getVehicleByPrice(BigDecimal price) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if(vehicle.getPrice().compareTo(price) == 0) {
                matchingVehicles.add(vehicle);
            }
        }
        return matchingVehicles;
    }

    public ArrayList<Vehicle> getVehicleByMileage(int odometer) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if(vehicle.getOdometer() == (odometer)) {
                matchingVehicles.add(vehicle);
            }
        }
        return matchingVehicles;

    }
    public ArrayList<Vehicle> getVehiclesByPrice(
            BigDecimal minPrice, BigDecimal maxPrice) {

        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {

            if (vehicle.getPrice().compareTo(minPrice)>= 0 && vehicle.getPrice().compareTo(maxPrice)<= 0) {
                matchingVehicles.add(vehicle);
            }
        }
        return matchingVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByMileage( int minMileage, int maxMileage) {
        ArrayList<Vehicle> matchVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= minMileage && vehicle.getOdometer() <= maxMileage) {
                matchVehicles.add(vehicle);
            }
        }
        return matchVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        ArrayList<Vehicle> matchVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                matchVehicles.add(vehicle);
            }
        }
        return matchVehicles;
    }
}

//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public ArrayList<Vehicle> getInventory() {
//        return inventory;
//    }
//
//    public void setInventory(ArrayList<Vehicle> inventory) {
//        this.inventory = inventory;
//    }
//}
