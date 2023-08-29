/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisefour;

/**
 *
 * @author jenna schrader
 * -- payroll app --
 * this program reads info from user input
 * and displays a payroll statement
 */

import java.util.Scanner; // import scanner

// begin class
public class ExerciseFour {

    /**
     * @param args the command line arguments
     */
    // begin main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // set up scanner for name
        System.out.print("Enter name: "); // prompt input
        String name = input.nextLine(); // assign name var to input
        // System.out.println(name);
        
        System.out.print("Enter hours worked: "); // prompt input
        double hours = input.nextDouble(); // assign hours var to input
        // System.out.println(hours);
        
        System.out.print("Enter hourly pay: "); // prompt input
        double hourly = input.nextDouble(); // assign hourly var to input
        // System.out.println(hourly);
        
        System.out.print("Enter federal tax withholding rate: "); // prompt input
        double fedTax = input.nextDouble(); // assign fed tax var to input
        // System.out.println(fedTax);
        
        System.out.print("Enter state tax withholding rate: "); // prompt input
        double stateTax = input.nextDouble(); // assign state tax var to input
        // System.out.println(stateTax);
        
        double grossPay = hours * hourly; // calculate gross pay
       
        double fedWithhold = grossPay * fedTax; // calculate federal withholding
      
        double stateWithhold = grossPay * stateTax; // calculate state withholding
        
        double totalDeduction = fedWithhold + stateWithhold; // calculate total deductions
      
        double netPay = grossPay - totalDeduction; // calculate net pay
        
        double fedPercent = fedTax * 100; // change to percentage
        
        double statePercent = stateTax * 100; // change to percentage
        
        
        System.out.println("\nEmployee Name: " + name); // display name
        System.out.println("Hours Worked: " + hours); // display hours
        System.out.printf("Hourly Pay: $%4.2f", hourly); // display & format hourly pay
        System.out.printf("\nGross Pay: $%4.2f", grossPay); // display & format gross pay
        
        System.out.println("\nDeductions:"); // display 
        
        System.out.printf("  Federal Withholding (%.1f%%): $%4.2f", fedPercent, fedWithhold); // display & format fed tax & withholding
        System.out.printf("\n  State Withholding(%.1f%%): $%4.2f", statePercent, stateWithhold); // display & format state tax & withholding
        System.out.printf("\n  Total Deduction: $%4.2f", totalDeduction); // display & format total deduction
        System.out.printf("\nNet Pay: $%4.2f", netPay); // display & format net pay
       
    }
    // end main
}
// end class
