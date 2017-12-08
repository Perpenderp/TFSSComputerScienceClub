/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017_s2;

import java.util.Scanner;

/**
 * title: Canadian Computing Contest 2017 S2
 * author: Pranay Kotian
 */

public class Main {

    public static void main(String[] args) {
       /*
        planning
        what we know
        * started at low tide, measurements alt low/high/low/high
        * all high tide higher than all low tide
        * increased range (highs higher and lows lower)
        
        * if dataset is odd then the last value must be lowtide
        
        dataset must be sorted from lowest to highest and then split
        1st half: the highest value is the first value of low tide
        2nd half: the lowest value is the first value of high tide
        * if dataset odd, median should be considered low tide value
        
        pseudocode
        * given 100 values, quicksort will be the most efficient
        
        store values in an arry
        use quicksort to sort values in array
        
        if (N%2 = 1) 
            range of 0 - (n/2) will be low tide
            range of (n/2 + 1) - (n-1)(last value in array) will be high tide
        else (dataset is even)
            range of 0 - (n/2 - 1) will be low tide
            range of (n/2)-(n-1) will be high tide values
        
        what I need to learn:
        * inputting space separated values
        * coding sorting algorithms
        * extracting values from an existing array into a new array
        
        
        */
       
       Scanner sc = new Scanner (System.in);
       
       int n = sc.nextInt();
       int w[] = new int[n];
       //Array that will hold all the values of the tides
       for (int i = 0; i < n; i++) {
           w[i] = sc.nextInt(); 
       }//Values are input into the array using the Scanner library
       sc.close(); 
       
       
    }
    
}
