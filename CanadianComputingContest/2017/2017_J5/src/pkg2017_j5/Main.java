/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017_j5;

import java.util.StringTokenizer;
import java.util.Scanner; 

/**
 * title: Canadian Computing Contest J5: Nailed it!
 * author: Pranay Kotian
 */

//http://www.cemc.uwaterloo.ca/contests/computing/2017/stage%201/juniorEF.pdf

public class Main {

    public static void main(String[] args) {
        
        /*
        Canadian Computing Contest quesitons often requires that you recieve input
        in space separated answers
        The following code can be used as a guideline for accepting space seperated input from a user
        (e.g. if they need to input five numbers they do it like this: 56 12 54 2 91
        you have to seperate the individual numbers from each other and store them in a location
        (usually an array))
        */
        
        Scanner sc = new Scanner (System.in);
        
        String input = sc.nextLine();
        StringTokenizer strToken = new StringTokenizer(input);
        int count = strToken.countTokens();
        //Reads in the numbers to the array
        int[] arr = new int[count];

        for(int x = 0;x < count;x++){
            arr[x] = Integer.parseInt((String)strToken.nextElement());
        }
        
    }
    
}
