/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017_j4;

import java.util.Scanner;

/**
 * title: Canadian Computing Contest J4: Favorite Times
 * author: Pranay Kotian
 */

//http://www.cemc.uwaterloo.ca/contests/computing/2017/stage%201/juniorEF.pdf

public class Main {

    public static void main(String[] args) {
        
        //Learning how to program a clock
        
        /*
        PSEUDOCODE 
        when minutes = 10, set minutes = 0, tens(minutes)++
        when tens == 60 and minutes == 10
            set minutes = 0, tens = 0, hour++
        when hour = 10,
            set hour = 0, tens(hour)++
        when tens(hour) = 1, hour = 2, tens(minutes) = 5, minutes = 10
            set tens(hour) = 0, hour = 1, tens(minutes) = 0, minutes = 0
        
        This code would work when adding minutes individually
        
        PSEUDOCODE for entering D minutes all at once
        
        *** Thinking of the clock as a single integer ***
        The time shown on the clock can be given as a single integer in order to determine if the digits follow an arithmetic sequence
        When the last two digits reach 60 the clock must be programmed to change to the next hour 
            (for 1 --> 11, this can be done by adding 100 and subtracting 60)
            (for 12 --> 1, the clock can subtract 1160 in order to return back to 12:00)
            In this problem, it is irrelevant whether the clock is in AM or PM, only the number of times an arithmetic sequence is present matters
        Through an initial test, it can be determined how many arithmetic sequences appear in one full cycle from 12:00 --> 11:59 and a simple division and remainer
            system can determine how many loops there are and simply calculate the remainder
        
        
        
        */
        
        Scanner sc = new Scanner (System.in);
        int D = Integer.parseInt(sc.nextLine());
        //Input duration from user
        
        int t = 1200;
        //Current time
        
        int c = 0;
        //Counter variable that will note the number of times an arithmetic series is created in the time
        
        //loop that will check for an arithmetic series in the digit of the t (time) variable
        for (int i=0; i <D; i++){
            
            int l = String.valueOf(D).length();
            //This determines the length of the current number
            int L2 = 0;
            int L1 = 0; 
            int L3 = 0;
            int L4 = 0; 
            
            if (l == 3) {
                L3 = Character.getNumericValue((String.valueOf(D)).charAt(1)); 
                L2 = Character.getNumericValue((String.valueOf(D)).charAt(2));
                L1 = Character.getNumericValue((String.valueOf(D)).charAt(3));
                
                if ((L3-L2)==(L2-L1))
                    c++;
            }
            else if (l == 4) { 
                L4 = Character.getNumericValue((String.valueOf(D)).charAt(1)); 
                L3 = Character.getNumericValue((String.valueOf(D)).charAt(2)); 
                L2 = Character.getNumericValue((String.valueOf(D)).charAt(3));
                L1 = Character.getNumericValue((String.valueOf(D)).charAt(4));
                
                if ((L4-L3)==(L3-L2)&&(L3-L2)==(L2-L1))
                    c++; 
            }
                      
            //Exit conditions for the D variables
            
            //Determines the last two digits of the time in order to determine if it is time to change the hour
            // (if the last digits are 59)
            
            if (D == 1259)
                D = 100;
            else if ((L2 == 5) && (L1 == 9)) 
                D+=41;
            else
                D++;
            
        }
        
        
    }
    
}
