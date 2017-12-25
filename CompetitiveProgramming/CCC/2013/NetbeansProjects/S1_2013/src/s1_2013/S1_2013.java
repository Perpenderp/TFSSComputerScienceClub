package s1_2013;

import java.util.*;

public class S1_2013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String n = sc.nextLine();
        int num;// = Integer.parseInt(n);
        boolean check = false;
        
        boolean complete = false;
        do {
            int length = n.length();
            for (int i =1; i <length;i++){
                if (n.charAt(0) == n.charAt(i))
                    check = true;
            }
            if (check = true) {
                check = false;
                num = Integer.parseInt(n) + 1;
                n = String.valueOf(num);
            }
            else {
                complete = true; 
                System.out.println(n); 
            }
        } while (complete = false); 
        //Return to this code later
    }
}
