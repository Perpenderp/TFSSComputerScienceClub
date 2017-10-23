/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2012_02_10_inter;

/**
 * Title: Challenge #1 Intermediate author: Pranay Kotian
 */
//https://www.reddit.com/r/dailyprogrammer/comments/pihtx/intermediate_challenge_1/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] hour = new String[24];

        System.out.println("What would you like to do? (add/remove/edit event from hourly schedule)");
        String cmd = sc.nextLine();

        if (cmd.equals("add")) {
            System.out.println("What hour of the day? (0-23)");
            int hr = sc.nextInt();
            
        } else if (cmd.equals("remove")) {
            
        } else //if (cmd.equals("edit")) 
        {
            
        }

    }

}
