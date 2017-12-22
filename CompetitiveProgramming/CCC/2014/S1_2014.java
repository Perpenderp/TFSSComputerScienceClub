
package s1_2014;

import java.util.*;

public class S1_2014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int k = sc.nextInt();
        //Number of friends
        int m = sc.nextInt();
        //Number of rounds of removal
        
        
        int c [] = new int [k];
        for (int i=0;i<k;i++)
            c[i]=i+1;
        
        int temp = 0;
        int len = 0;
        int counter = 0;
        
        for (int j=0;j<m;j++){
            temp = sc.nextInt();
            //Every temp'th person from the list is removed
            
            //for(int a=0;a<k/temp;a++)
            //    c[temp*(a+1)-1]=-1; 
            //This code removes the nth person from the overall list
            // not considering if someone has already been removed
            
            for (int p=0;p<k;p++){
                if (c[p] != -1){
                    counter++;
                    if (counter%temp==0)
                        c[p]=-1; 
                }
                //Counter keeps track of people that have been checked off 
                // and allows us to skip people who have already been removed
            }
            
            //Every time the program encounters an array element that doesnt contain
            // a -1 (indicating that this person has been removed), it adds a value to the
            // counter and if  the counter reaches a multiple of the nth removal number,
            // that person is removed (set to -1)
            
            counter = 0; 
        }
        //Code removes the third friend regardless of how many people
        // have already been removed
        
        for (int l=0;l<k;l++)
            if (c[l]!=-1)
                System.out.println(c[l]);
    }
    
}
