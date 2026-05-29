/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Suke
 */
public class ProductBillTest {

    public static void main(String[] args) {

        // Exception occurs because "two"
        // cannot be converted into int
        ProductBill obj =
                new ProductBill("1500.00", "two");

        try {

            double total = obj.calculateTotal();

            System.out.println("Total = " + total);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Error: Price and quantity must be valid numbers.");

        } finally {

            System.out.println(
                    "Product bill calculation completed.");
        }

        System.out.println("Program continues...");
    }
}

