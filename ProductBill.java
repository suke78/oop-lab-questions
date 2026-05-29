/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Suke
 */
public class ProductBill {

    // Attributes
    private String priceText;
    private String quantityText;

    // Constructor
    public ProductBill(String priceText, String quantityText) {

        this.priceText = priceText;
        this.quantityText = quantityText;
    }

    // Method
    public double calculateTotal() {

        double price =
                Double.parseDouble(priceText);

        int quantity =
                Integer.parseInt(quantityText);

        return price * quantity;
    }
}
