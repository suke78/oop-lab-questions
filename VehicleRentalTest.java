/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author Suke
 */
public class VehicleRentalTest {

    public static void main(String[] args) {

        Vehicle vehicle1 =
                new Car("CAR101", "Toyota", 5, 8000);

        Vehicle vehicle2 =
                new Bike("BIKE202", "Honda", 10, 500);

        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: "
                + vehicle1.calculateRentalCost());

        System.out.println();

        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: "
                + vehicle2.calculateRentalCost());

        // Runtime polymorphism happens because
        // the overridden method is selected at runtime
        // based on the actual object type.
    }
}
