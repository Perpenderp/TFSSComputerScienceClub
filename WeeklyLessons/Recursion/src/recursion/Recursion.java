package recursion;

public class Recursion {

    public static void main(String[] args) {
        //          ***RECURSION***
        
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
        
                * EXAMPLE: in the above code, 
        
        Direct and Indirect Recursion
        
        
        Tailed and Non-tailed Recursion
        
        Memory Allocation
        
        Recursive vs Iterative Programming
        
        Practice Problems
        
        */
    }
    
}
