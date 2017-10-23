/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017_j2;

/**
 * title: Canadian Computing Contest J2
 * author: Pranay Kotian
 */

//http://www.cemc.uwaterloo.ca/contests/computing/2017/stage%201/juniorEF.pdf

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        //Input from users
        
        //Since the program only asks for the sum and we do not need to print
        // the original variable, the number variable that holds the input from
        // the user is reused as the sum variable to keep track of the sum and final output
        
        for (int i = 1; i < (k + 1); i++) {
            //Each shifty is the original number multiplied by 10 to the power of
            //  the given k value
            //This process is repeated for every number before k (e.g. if k = 3 then
            // the sum will have num*10^1 + num*10^2 + num*10^3)
            
            num += num*(int)(Math.pow(10, i));
            //This adds the (number times the power of 10) to the overall sum
        }
        System.out.println(num);
        //Prints sum
    }
    
}
