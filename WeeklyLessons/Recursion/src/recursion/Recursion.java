package recursion;

public class Recursion {

    public static void main(String[] args) {
        //                              ***RECURSION***
        
        /*
        What is Recursion?
        - Function calls itself directly or indirectly 
        - Corresponding function is a recursive function
        - Recursion can be used to solve problems such as the Towers of Hanoi (TOH)
          Inorder/Preorder/Postorder Tree Traversals, DFS of Graph, etc.
        
        What is the base condition in recursion?
        - Bigger problems are expressed as smaller problems
        - Solution to the base case is what is reference in the last step
        
            int fact(int n)
            {
                if (n < = 1) // base case
                    return 1;
                else    
                    return n*fact(n-1);    
            }
        
                * EXAMPLE: in the above code, the method keeps calling (n-1) until the base case
                           of n <= 1 is reached. 
        
        Stack Overflow errors
        - If a base case is never reached or defined, then this error may occur
        
            int fact(int n)
            {
                // wrong base case (it may cause
                // stack overflow).
                if (n == 100) 
                    return 1;

                else
                    return n*fact(n-1);
            }
        
                * EXAMPLE:  in the above code, if the user calls the method for a number less than 100
                            the base case for (n == 100) will never be reached and will infinitely call itself
                            causing the stack overflow error
        
        Direct and Indirect Recursion
        - Direct: function x that calls itself directly
        - Indirect: function x that calls another function y that may call x directly or indirectly
        
            void directExample () {
                ...code...
                directExample(); //The method calls itself directly
                ...code...
            }
            
        
            void indirectExampleX () {
                ...code...
                indirectExampleY ();
                ...code...
            }
        
            void indirectExampleY () {
                ...code...
                indirectExampleX (); //method X calls itself indirectly through method Y
                ...code...
            }
        
        Tailed and Non-tailed Recursion
        - Tailed recursive: method ends with the recursive method call
        
            void tailedExample() {
                ...code...
                tailedExample (); 
            }
        
        Memory Allocation
        
        
        
        */      
    }
    
    
    
    public void part2 () {
        /*
                
        Recursive vs Iterative Programming
        
        Practice Problems
        
        */
    }
    
}
