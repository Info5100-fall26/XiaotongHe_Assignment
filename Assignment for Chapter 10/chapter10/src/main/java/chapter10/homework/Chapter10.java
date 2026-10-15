package chapter10.homework;

import java.util.Scanner;

abstract class Vehicle {
    protected String name;
    protected Double speed;

    public Vehicle(String name, Double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double travelTime(double distance) {
        return distance / speed;
    }

    abstract void move();
}

class Car extends Vehicle {
    public Car(){
        super("Car", 60.0); //average speed of a car is 60 km/h
    }

    public void move() {
        System.out.println("People drive cars on the ground.");
    }
}

class Motorbike extends Vehicle {
    public Motorbike(){
        super("Motorbike", 40.0); //average speed of a motorbike is 40 km/h
    }

     public void move() {
        System.out.println("People ride motorbikes on the ground.");
    }
}

class Aircraft extends Vehicle {
    public Aircraft(){
        super("Aircraft", 800.0); //average speed of an aircraft is 800 km/h
    }

    public void move() {
        System.out.println("People fly aircrafts in the sky.");
    }
}

class Ship extends Vehicle {
    public Ship(){
        super("Ship", 30.0); //average speed of a ship is 30 km/h
    }

    public void move() {
        System.out.println("People sail ships on the water.");
    }
}
public class Chapter10 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Motorbike(), new Aircraft(), new Ship()};
        Scanner myScanner = new Scanner(System.in); 
        System.out.println("Enter distance in kilometers(with decimal points):");
        double distance = myScanner.nextDouble();
        if (distance <= 0) {
    System.out.println("Distance must be greater than 0.");
    return;
}
        
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getName());
            vehicle.move();
            String time = String.format("%.1f", vehicle.travelTime(distance));
            System.out.println(vehicle.name + " will take " + time + " hours to travel " + distance + " kilometers." + "\n");
        }

        double minTime= vehicles[0].travelTime(distance);
        String fastestVehicle = vehicles[0].getName();
        for (Vehicle vehicle : vehicles) {
            double time2 = vehicle.travelTime(distance);
            if (time2 < minTime) {
                minTime = time2;
                fastestVehicle = vehicle.getName();
            }
        }

        System.out.println("The fastest travel time is " + String.format("%.1f", minTime) + " hours with " +fastestVehicle + ".");
        myScanner.close();
    }
}
