/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017_j4;

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
        Through an initial test, it can be determined how many arithmetic sequences appear in one full cycle from 12:00 --> 11:59
        
        
        */
        
        
        
        
        
    }
    
}
