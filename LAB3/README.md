# 22122011-MDS273L-JAVA

Name: Annet Jacob
Reg. No: 22122011
Email: annet.jacob@msds.christuniversity.in
Class:  MSc. DS A

#QUESTION:

Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
You can use a two-dimensional array to store the details.
HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}

You need to have functions to:
Collect the details of the student
Display the details of the student
Search the details of the student
With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.

Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.

You will have a function to perform this search operation, which can be used to implement two functionality in the code
To check if the name is already entered
While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have
Four functions inside your lab program class including your main class
One static String array storing the names (note the program can store up to 1024 students)
One two-dimensional string array storing the details of up to 1024 students
A menu-driven main method implementing the functions and functionality
Plan your program with a flow chart before starting with coding.
Since you are using functions, plan what should be the returning values and how to implement them.

#DESCRIPTION:

This programme is written in Java and implements a simple student information system. The programme allows the user to carry out four distinct actions:


1. Enter student information: The user can enter student information such as name, register number, email, class, and department. If the user attempts to enter the details of a student whose name already exists in the system, a message indicating that the details already exist will be displayed.


2. Display student information: The user can view information about all students in the system.

3. Search for student details: The user can search for a student's details by entering the student's name. If the information is discovered, it will be displayed. If the information is not found, a message indicating that no information was found will be displayed.

4. Exit: The user has the option to exit the programme.

The programme reads the user's inputs and performs the corresponding actions based on the user's selection using a Scanner object. The programme stores the student details in two arrays: "names" for all students' names and "details" for the remaining details for each student. The programme searches for a student by name and returns the index of the student in the "details" array if one is found, or -1 if not found.


