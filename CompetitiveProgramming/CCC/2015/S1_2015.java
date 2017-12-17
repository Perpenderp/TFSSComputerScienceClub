package s1_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class S1_2015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int k = sc.nextInt();
        ArrayList<Integer> n = new ArrayList<Integer>();
        
        for (int i=0;i<k;i++) {
            int num = sc.nextInt();
            if (num==0)
                n.remove(n.size() - 1);
            else
                n.add(num);
        }
        int sum = 0;
        for (int i=0;i<n.size();i++){
            sum+=n.get(i);
        }
        System.out.println(sum);
    }
}
