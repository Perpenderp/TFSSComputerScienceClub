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
        
        int s = 0;
        for (int i = 0; i < n-2; i++){
            for (int j = 0; j < i;j++){
                s+=w[j];
            }
            
        }
    }
}
