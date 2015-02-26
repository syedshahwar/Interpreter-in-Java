Abstract:
An interpreter that reads a file with a declarative language containing variable declarations and simple arithmetic operations. These commands are then executed and the result is displayed.
Objectives:
•	Create an Interpreter which can execute simple arithmetic commands and store variable declarations.
•	Read the declarations from a file.
•	Use a Version Control System (VCS) to manage their solutions

Language: Java
IDE: Eclipse
Tasks:
•	Look for syntax errors in the declaration file.
•	Implement the interpreter to execute the declarations.

File’s form and how interpretation would be done:
Declarations of variables 
Let x = 0
Let y = 1
Let z = 3

Arithmetic operation on two immediate values and storing in variable
x = 2 + 3
y= 3 * 6 


Arithmetic operation on two variables and storing in variable
 z = x – y
 y = x / x

Arithmetic operations one variable and one immediate value and storing in variable
x = y * 3
z = 2 - y 

Printing immediate value
print 5

Printing variable
print x 

ERRORS
Not Initialized
Initialization error as ‘a’ is not initialized using Let declarative
a = x + y
x = a – z
print a

Syntax Errors
Immediate value can’t be used to store value
2 = 1 + 2
3 = x - y
Equal Sign missing
Let m 0
z 3 +4

Invalid Arithmetic Operation
x =3 @ 4
