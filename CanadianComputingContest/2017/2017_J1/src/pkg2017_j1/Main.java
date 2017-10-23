/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017_j1;

/**
 * title: Canadian Computing Contest 2017 J1
 * author: Pranay Kotian
 */

//http://www.cemc.uwaterloo.ca/contests/computing/2017/stage%201/juniorEF.pdf

import java.util.Scanner;
//Imports the scanner class that will allow us to accept input from the user

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        //Recieves two numbers from user
        
        if (x > 1) {
            if (y > 1)
                System.out.println("1");
            else
                System.out.println("4");
        }
        
        
        else { //There is no other option besides having x being negative
            if (y > 1)
                System.out.println("2");
            else
                System.out.println("3");
        }
        
        //Use of else statements when there is only one other option
        // is important in terms of efficiency
        //Try to make your programs as efficient as possible to get the highest marks
        // (in other words, if you can accomplish the same task with fewer 
        //  operations or lines of code then your program can be more efficient)
    }
}
