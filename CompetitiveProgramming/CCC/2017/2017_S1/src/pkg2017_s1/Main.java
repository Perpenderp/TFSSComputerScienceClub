/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017_s1;

/**
 * title: Canadian Computing Contest 2017 S1
 * author: Pranay Kotian
 */

//

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Libraries used for 

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String in1 = sc.nextLine();
        char temp1 = ' ';
        String in2 = sc.nextLine();
        char temp2 = ' ';
        //Inputs N value and string of numbers for the score
        
        //List<Integer> list1 = new ArrayList<Integer>();
        //List<Integer> list2 = new ArrayList<Integer>();
        
        /*
        for (int i = 0; i < n; i++) {
            //This loop will go through all the 
            if (in1.charAt(i)!=' '){
                temp1 = in1.charAt(i);
                //Temporary variable stores the number
                list1.add(Character.getNumericValue(temp1));
                //Char (or character) temp1 variable is converted to an integer
                // (Character.getNumericValue(int)) and is added the array of numbers
            }
                
            if (in2.charAt(i)!=' ') {
                temp2+=in2.charAt(i);
                list2.add(Character.getNumericValue(temp2));
                //Same process is repeated but for the other team in a second Array
                // that will track their scores
            }
        }
        //The two arrays, for the two teams, should now contain their scores for each day
        */
        //This method does not work - it doesnt account for numbers that have more than one digit
        
        String [] tokens1 = in1.split(" ");
        String [] tokens2 = in2.split(" ");
        int [] ary1 = new int[tokens1.length];
        int [] ary2 = new int[tokens2.length];
        
        int i = 0;
        for (String token : tokens1) {
            ary1[i++] = Integer.parseInt(token); 
        }
        for (String token : tokens2) {
            ary2[i++] = Integer.parseInt(token);
        }
        //NOTE: TEMPORARY SOLUTION // LEARN ABOUT TOKEN FUNCTION
        
        /*
        pseudocode
        
        N = days of season
        largest K such that totals runs up to this date is equal
        
        team 1 runs counter = 0
        team 2 runs counter = 0
        k = 0   (both teams will have 0 runs are the beginning of the season
                therefore this will be used as the starting value for K)
        
        array stores T1 scores of each day
        array stores T2 scores of each day
        
        for (int i = 0; i < N; i++) {
            T1+= T1array[i];
            T2+= T2array[i];
            if (T1 == T2)
                K = i+1; 
        }
        
        Loop will through all the days and will update the K variable if both teams have the same runs
        since the loop runs from the first to the last day, the highest value of K will be recorded. 
        
        */
        
    }
}
