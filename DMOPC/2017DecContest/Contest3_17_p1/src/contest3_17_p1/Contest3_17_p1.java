package contest3_17_p1;

import java.util.Arrays;
import java.util.Scanner;

public class Contest3_17_p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       int w[] = new int[n];
       
       for (int i = 0; i < n; i++) 
           w[i] = sc.nextInt();
        
       Arrays.sort(w); 
       System.out.println(w[0]);
    }
    
}
