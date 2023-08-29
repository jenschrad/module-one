/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisethree;

/**
 *
 * @author jenna schrader
 * -- lottery game --
 * this program generates a random three-digit number, 
 * prompts the user for a three digit number,
 * and then determines if the user's number 
 * matches the order exactly, matches the digits, or matches one digit
 * if the number matches, an award is displayed based on the rules above, 
 * if not, a message saying no matches is displayed
 */ 

import java.util.Scanner; // import scanner

// begin class
public class ExerciseThree {

    /**
     * @param args the command line arguments
     */
    
    // begin main
    public static void main(String[] args) {
        // declare range of nums to make sure the num is three digits
        int min = 100;
        int max = 999;
        // generate random three digit num
        int win = (int)(Math.random() * (max - min)) + min;
        System.out.println(win);
        
        // prompt user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit number: ");
        int guess = input.nextInt();
       
       // get winning nums
       int winNum1 = win / 100; // first num
       // System.out.println(winNum1);
       int winNum2 = win / 10 % 10; // seccond num
       // System.out.println(winNum2);
       int winNum3 = win % 10; // third num
       // System.out.println(winNum3);
       
       // get guess nums
       int guessNum1 = guess / 100;
       // System.out.println(guessNum1);
       int guessNum2 = guess / 10 % 10;
       // System.out.println(guessNum2);
       int guessNum3 = guess % 10;
       // System.out.println(guessNum3);
        
       // display winning num
        System.out.println("The winning number is " + win);
        
       // begin if code block  
       if (guess == win ) // if the guess num is equal to the winning num
       { 
           System.out.println("You got an exact match, you win $10,000!"); // display message
           
       } else if (guessNum1 == winNum2 || guessNum1 == winNum3 // if 1st digit is equal to 2nd or to 3rd digit and
               && guessNum2 == winNum1 || guessNum2 == winNum3 // if 2nd digit is equal to 1st or 3rd digit and
               && guessNum3 == winNum1 || guessNum3 == winNum2) // if 3rd digit is equal to 1st or 2nd digit
       {
           System.out.println("You got all the digits correct, you win $3,000!"); // display message    
       } else if (guessNum1 == winNum1 // if 1st digit equal to 1st
               || guessNum1 == winNum2 // if 1st digit equal to 2nd
               || guessNum1 == winNum3 // if 1st digit equal to 3rd
               || guessNum2 == winNum1 // if 2nd digit equal to 1st
               || guessNum2 == winNum2 // if 2nd digit equal to 2nd
               || guessNum2 == winNum3 // if 2nd digit equal to 3rd
               || guessNum3 == winNum1 // if 3rd digit equal to 1st
               || guessNum3 == winNum2 // if 3rd digit equal to 2nd
               || guessNum3 == winNum3)// if 3rd digit equal to 3rd
       { 
           System.out.println("You got one digit right, you win %1,000!"); // display message
       } else 
       {
           System.out.println("No matches."); // display message
       }
       // end c0de block
    }
    // end main
    
}
// end class
