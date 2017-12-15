
package arrays_in_java;

public class Arrays_in_Java {


    public static void main(String[] args) {
        //              ***ARRAYS IN JAVA***
        
        /*
        CREATING, INITIALIZING, AND ACCESSING AN ARRAY
        One Dimensional Arrays:
        
        type var-name[];
        OR
        type [] var-name;
        
        INSTANTIATING AN ARRAY IN JAVA
        
        var-name = new type [size];
        
        - type: int, double, String, etc.
        - size: number of elements in an array
        - var-name: name of variable
        
        */
        
        int [] arr;                 //declaring an array
        // the array doesn't exist yet, the compiler just knows that this variable (arr)
        // holds an array of the integer type
        
        arr = new int [20];         //allocating memory to array
        
        int [] arr2 = new int [20]; //combines the above two statements into one line
        
        /*
            1.  Elements in the array allocated by new will automatically = 0
                (for numeric types), false (for boolean, and null (for reference types)
            2.  Arrays are dynamically allocated: (2 step process) declaring a variable of the
                desired array type and allocating the memory that will hold the array (using new)
                and assigning it to the array variable
        
        
         */
        
        
    }
    
}
