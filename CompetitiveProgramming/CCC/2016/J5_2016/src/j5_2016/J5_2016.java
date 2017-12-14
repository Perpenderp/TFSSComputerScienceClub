package j5_2016;

import java.util.*;

public class J5_2016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Quesiton type variable (1 or 2)
        int q = sc.nextInt();
        
        //Number of citizens variable
        int n = sc.nextInt(); 
        
        //Arrays to hold speeds of players from both nations
        int dmo [] = new int [n];
        int peg [] = new int [n]; 
        
        //Individual speeds for each player are added to separate arrays
        for (int i = 0; i < n; i++)
            dmo[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            peg[i] = sc.nextInt();
        
        //Both arrays sorted in ascending order using quicksort
        Arrays.sort(dmo);
        Arrays.sort(peg);
        
        //Total speed counter
        int speed = 0; 
        
        //For minimum posssible total speed
        //Fast players should be matched with fast players
        if (q == 1) {            
            //Speeds between paired citizens are compared and the faster speed is added to the speed variable
            // Fast citizens are compared with fast players to find the minimum
            for (int i=0;i<n;i++){
                if (dmo[i]>peg[i])
                    speed+=dmo[i];
                else //(dmo[i]<peg[i])
                    speed+=peg[i]; 
            }
        }
        //For maximum possible total speed
        //slow citizens should be matched up with fast players
        else //(q == 2)
        {
            //Both arrays are sorted in ascending order so opposite end of the arrays are compared
            // with the faster speed being added to the total speed
            for (int i=0;i<n;i++){
                if (dmo[n-1-i]>peg[i])
                    speed+=dmo[n-1-i];
                else //(dmo[i]<peg[i])
                    speed+=peg[i]; 
            }
        }
        
        //Final total speed is printed
        System.out.println(speed);
    }
}
