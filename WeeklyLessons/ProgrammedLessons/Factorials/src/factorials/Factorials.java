package factorials;

public class Factorials {

    public static void main(String[] args) {
        //***FACTORIALS***
        
        /*
        Factorial: multiplication of all integers less than or equal to n (given n is a
         non negative number)
        For example, 6! (symbol for factorial is !) = 6*5*4*3*2*1
        
        */
    }
    
    public int factorial (int n) {
        if (n==0)
            return 1;
        //The base case for factorials is 0! which equals 1
        
        //The factorial is calculated using a something call recursion
        
        return n * factorial(n-1); 
    }
}
