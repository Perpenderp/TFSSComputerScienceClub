package contest3_17_p3;

import java.io.*;
import java.util.*;

public class Contest3_17_p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int n = sc.nextInt(); 
        int w[] = new int[n];
        for (int i = 0; i < n; i++) 
           w[i] = sc.nextInt();
        Arrays.sort(w); 
        
//        for (int i = 0; i < n-1;i++){
//            if (w[i] == w[i+1])
//                System.out.println(w[i]+"\n"+w[i+1]);
//        }
        
        /*
        
        Determine how many numbers to add together
        Determine where to start adding from
        Compare sum with proceeding values in array
        Stop if sum greater than value and go back
        Stop if sum equals value
        
        */

        int s = 0;
        for (int i = 1; i < n-1; i++){
            //i equals the number of values that will be added
            
            //max adding position
            int max = n-1-i;
            
            for (int k = 0; k < max; k++){
                //loop that goes through all starting positions
                
                for (int j = 0; j < i; j++){
                    s+=w[j];
                }
            }
            
               
        }
    }
}
