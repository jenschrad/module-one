/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisetwo;


import java.util.Scanner;  // import scanner 

/**
 *
 * @author jenna schrader
 * this program takes a numerical input in feet,
 * converts the input to meters, and then
 * displays the results
 */

// begin class
public class ExerciseTwo {

    /**
     * @param args the command line arguments
     */
    // begin main
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // get input with user prompt
        System.out.print("Enter a number to convert from feet to meters: ");
        
        // declare var for user input
        double feet = input.nextDouble();
        
        // covert to meters
        double meters = (feet * 0.3048);
        
        // display result 
        System.out.println( feet + " feet" + " is " + meters + " in meters.");
    }
    // end main
    
}
// end class
