/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Suke
 */
public class StudentMarkReport {

    // Attribute
    private String[] marks;

    // Constructor
    public StudentMarkReport(String[] marks) {

        this.marks = marks;
    }

    // Method
    public int getMarkAt(int index) {

        String mark = marks[index];

        return Integer.parseInt(mark);
    }
}
