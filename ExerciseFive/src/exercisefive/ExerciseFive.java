/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisefive;

/**
 *
 * @author jenna schrader
 * program displays two tables side by side of kilos to pounds 
 * and pounds to kilos
 * 
 * while kilos is less than or equal to 199, multiply kilo num by 2.2 with a step of 2
 * while pounds is equal to 20 and less than or equal to 515, divide by 2.2 with a step of 5
 */

// begin class
public class ExerciseFive {

    /**
     * @param args the command line arguments
     */
    
    // begin main
    public static void main(String[] args) {
       // display table heading formatted
       System.out.printf("%-15s%-10s%-15s%-10s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");
       
       // combined for loop for converting kilos to pounds and pounds to kilos
       // for 1 kilo to 199 kilos with a step of +2, convert to pounds and for 20 pounds to 515 pounds with a step of +5, convert pounds to kilos
        for (int count = 1, count2 = 20; count <= 199 && count2 <= 515; count += 2, count2 += 5) {
            double kilo = 2.2; // declare/assign kilo var to 2.2 val
            double pound = count * kilo; // conversion for kilo to pound
            double kilo2 = 2.2; // declare/assign another var for kilo
            double pound2 = count2 / kilo2; // pound to kilo conversion
            // display the conversions formatted like the tables in the book!
            System.out.printf("%-15d%-10.1f%-15d%-10.2f\n", count, pound, count2, pound2);
 
       }  
               
    }
    // end main
}
// end class




