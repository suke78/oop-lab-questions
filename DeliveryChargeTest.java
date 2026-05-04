/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author Suke
 */
public class DeliveryChargeTest {

    public static void main(String[] args) {

        DeliveryChargeCalculator calculator =
                new DeliveryChargeCalculator();

        double charge1 = calculator.calculateCharge(1000.0);

        double charge2 = calculator.calculateCharge(1000.0, 5.0);

        double charge3 = calculator.calculateCharge(1000.0, 5.0, 10.0);

        double charge4 = calculator.calculateCharge(1000.0, true);

        System.out.println("Base Charge Only: " + charge1);

        System.out.println("Base Charge + Distance Charge: " + charge2);

        System.out.println("Base Charge + Distance + Weight Charge: "
                + charge3);

        System.out.println("Base Charge + Express Delivery: "
                + charge4);
    }
}
