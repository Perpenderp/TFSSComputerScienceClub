package s2_2015;

import java.util.*; 

public class S2_2015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int j = sc.nextInt(); //Number of jerseys
        int a = sc.nextInt(); //Number of athletes
        
        char [] sizes = new char [j]; //Array that stores jersey sizes
        //Index element number + 1 = the number of this jersey
        boolean  [] taken = new boolean [j];
        //This array will store true and false (if position = true then jersey is taken)
        
        for (int i=0;i<j;i++)
            taken[i]=false; 
        
        for (int i=0;i<j;i++){
            sizes[i] = sc.next().charAt(0);
        }
        //Sizes of jerseys are added to an array
        
        char S;
        int s; 
        
        //L M N O P Q R S 
              
        for (int i=0;i<a;i++){
            S = sc.next().charAt(0);
            s = sc.nextInt();
            if (sizes[s-1] == S || S > sizes[s-1])
                taken[s-1] = false;
            //If the requested size and number are available to a player
            // the taken array index associated with that jersey is set to true
            // indicating that the jersey is taken
            //It doesn't matter if two people want the same jersey, the taken
            // variable doesn't change in accordance to how many people want the jersey
            // only that the jersey will be taken by someone
        }
        //Taken array should be full of values corresponding to jerseys that are taken
        
        int counter = 0;
        boolean temp; 
        for (int i=0;i<j;i++){
            temp = taken[i];
            if (temp = true)
                counter++;
        }
        
        System.out.println(counter); 
    }
}
