

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2012_02_10_easy;

//Imports required libraries

//import java.io.File;
//import java.io.FileNotFoundException;
//Used to write to an external file

import java.util.Scanner;
//Used to input data from the user

/**
 * title: Challenge #1 Easy
 * author: Pranay Kotian
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        //Name
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        //Age
        System.out.println("Enter your Reddit username: ");
        String user = sc.nextLine();
        
        //Reddit username
        

        System.out.println("Your name is "+name+", you are "+age+" years old, and your username is "+user+".");
        
        /*
        File file = new File ("info.txt");
        
        try {
            
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
        
        //Writing to an external text file
        //Currently not working and commented out
    }
    
}
