/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017_j3;

/**
 * title: Canadian Computing Contest J3
 * author: Pranay Kotian
 */

//http://www.cemc.uwaterloo.ca/contests/computing/2017/stage%201/juniorEF.pdf

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //The fastest path between two points on the grid
        // will simply equal the change in the x value and change in the y value
        // there are no diagonal paths so this will always be the fastest path
        
        Scanner sc = new Scanner (System.in);
        
        //Gets corordinates for starting and ending point on the grid
        String c1 = sc.nextLine();
        int x1 = Character.getNumericValue(c1.charAt(0));
        int y1 = Character.getNumericValue(c1.charAt(2));

        String c2 = sc.nextLine();
        int x2 = Character.getNumericValue(c2.charAt(0));
        int y2 = Character.getNumericValue(c2.charAt(2));
        //Input is restricted to single digit numbers so extracting the specific
        // character within the string and converting it to an int will work
        // if double digit numbers are input this method will not work

        int p = sc.nextInt();
        //Number of power units
        
        int cx = Math.abs(x2-x1);
        int cy = Math.abs(y2-y1);
        //Program can be made more efficient by not declaring new variables
        // and instead making this calculation inside the if statement
        
        if ((cx + cy) > p)
            System.out.println("N");
        else //((cx + cy) < p) ~there are enough power units
            System.out.println("Y"); 
        
    }
    
}
