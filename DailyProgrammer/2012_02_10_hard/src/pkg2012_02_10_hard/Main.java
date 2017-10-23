/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2012_02_10_hard;

/**
 * title: Challenge #1 Hard author: Pranay Kotian
 */
//https://www.reddit.com/r/dailyprogrammer/comments/pii6j/difficult_challenge_1/
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    //Global variables can be accessed by all methods within the file 
    public static void main(String[] args) {

        //Loop that will continue to guess until
        // your number has been determined
        String guess;
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 100;
        int num = min + max / 2;
        //These variabbles are used to keep track of the range of numbers the user's
        // answer is within
        // e.g. if they answer less than 50 then their number must be between 0-49
        //      (the max would be 50 and the min would be 0)
        
        int temp;
        //temp variable is used to transfer numbers
        
        int g = 0;
        //number of guesses counter
        
        int c = 0;
        //When this variable is equal to 1 then the loop knows that the computer has guessed
        // the user's number

        System.out.println("Think of a number between " + min + " and " + max + ".");
        //Initial line telling user to think of a number
        
        while (c == 0) {
            System.out.println("Is your number higher, lower or equal to " + num + "? (higher/lower/equal)");
            guess = sc.nextLine();
            if (guess.equalsIgnoreCase("higher")) {
                if (num == 99) {
                    num = 100;
                } else {
                    temp = num; 
                    num = Math.round((num + max) / 2);
                    min = temp; 
                }
                g++;
            } else if (guess.equalsIgnoreCase("lower")) {
                temp = num;
                num = Math.round((num + min) / 2);
                max = temp; 
                g++;
            } else if (guess.equalsIgnoreCase("equal")) {
                System.out.println("I guessed your number in " + g + " guesses!");
                c = 1;
            } else //(!guess.equalsIgnoreCase("higher") || !guess.equalsIgnoreCase("lower") || !guess.equalsIgnoreCase("equal"))
            {
                System.out.println("Please enter again.");
            }
        }
    }

}
