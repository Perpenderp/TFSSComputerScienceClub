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
        
        /*
        for (int i = 0; i < n-1;i++){
            if (w[i] == w[i+1])
                System.out.println(w[i]+"\n"+w[i+1]);
        }
        */
        
        /*
        
        Determine how many numbers to add together
        Determine where to start adding from
        Compare sum with proceeding values in array
        Stop if sum greater than value and go back
        Stop if sum equals value and output
        
        */

        int s = 0;
        //temp variable for the sum of various sweetnesses
        
        for (int i = 1; i < n-1; i++){
            //i equals the number of values that will be added
            
            //max adding position given the number of values being added together
            int max = n-i-1;
            
            for (int k = 0; k < max; k++){
                //loop that goes through all starting positions
                
                ArrayList<Integer> num1 = new ArrayList<Integer>();
                for (int j = 0; j < i; j++){
                    //Loop that sums i number of elements
                    num1.add(w[k+j]); 
                    s+=w[k+j];
                }
                int fstart = k + i;
                //starting position + # of values added together
                
                for (int a = fstart; a < n-1; a++) {
                    if (s == w[a]) {
                        for (int z = 0; z < num1.size(); z++)
                            System.out.print(num1.get(z)+" ");
                        System.out.println("\n"+w[a]);
                        a = n-1;
                        k = max;
                        i = n-1; 
                    }
                    else if (s < w[a])
                        a = max; 
                }
                
                num1.clear();
                s = 0;
                
                
                //Resets sum if loops cannot find match values within array

            }
            
            
        }
    }
}
