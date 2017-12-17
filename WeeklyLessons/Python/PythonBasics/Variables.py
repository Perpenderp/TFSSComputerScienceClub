#VARIABLES in PYTHON

#Increment and Decrement Operators in Python
    #Increment and decrement operators are not allowed in python
    #You don't write code like this:
        #for (int i = 0; i < 5; i++)
    #In Python you would write:


#Sample Python program to show loop (unlike other languages it doesnt use ++)
for i in range (0, 5):
    print(i)

#   i++ can be written as i+=1 and i-- can be written as i-=1

#Variables, Expressions, Conditions and Functions
    #Variables don't need to be declared first in python, they can be used directly
    #Variables in python are case sensitive

#Variables and Expressions
a = 3
A = 4
b = a + A
print (b)
print (A)

#Conditionals: if elif and else are used
a = 3
b = 9
if b % a == 0:
    print ("b is divisible by a")
elif b + 1 == 10:
    print ("Increment in b produces 10")
else:
    print ("You are in else statement")

#Functions: declared by the keyword 'def' before the name of the function
    #return type does not need to be specified explicitly
    #function invoked by typing function name and parameters in brackets
