/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3_17_p0;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Contest3_17_p0 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        a/=2;
        NumberFormat f = NumberFormat.getCurrencyInstance();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("$"+df.format(a)+" $"+df.format(a)); 
   }
    
}
