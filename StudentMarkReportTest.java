/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Suke
 */
public class StudentMarkReportTest {

    public static void main(String[] args) {

        String[] marks = {"78", "82", "absent", "90"};

        StudentMarkReport obj =
                new StudentMarkReport(marks);

        // Exception occurs because index 6
        // does not exist in array
        try {

            int mark = obj.getMarkAt(6);

            System.out.println("Mark = " + mark);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Error: Selected mark position does not exist.");

        } finally {

            System.out.println(
                    "Array access checking completed.");
        }

        // Exception occurs because "absent"
        // cannot convert into int
        try {

            int mark = obj.getMarkAt(2);

            System.out.println("Mark = " + mark);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Error: Selected mark is not a valid number.");

        } finally {

            System.out.println(
                    "Number conversion checking completed.");
        }

        System.out.println("Report checking completed.");
    }
}
