# Develop-own-programming-language-by-using-java
Anello Means Object-Oriented Hybrid of Java and BASIC. All Anello code is compiled to Java Byte Code, and hence, Anello is FULLY COMPATIBLE with other Java classes. This means that all Anello programs can use Java classes, and vice versa.
1.INTRODUCTION
Welcome to Anello.
Anello Means Object-Oriented Hybrid of Java and BASIC.
All Anello code is compiled to Java Byte Code, and hence, Anello is FULLY COMPATIBLE with other Java classes. This means that all Anello programs can use Java classes, and vice versa.

2.PREREQUISITES
Before you can compile Anello classes to Java Byte Code, you MUST HAVE JDK(Java Development Kit) installed on your PC.
If you do not have JDK installed, you can download it for free from Oracle's site. Just Google it up.

3.GETTING STARTED
If you have ANY programming knowledge at all, you can start coding in Anello at once. The things you need to know are given below:-
Basic Syntax:
Declaring Variables: There are no primitive datatypes in Anello.Every variable is initialised as an object of the 'var' class provided in myAPI. The syntax for declaring variables is-decvar a, b, c 


Giving Values To Variables:
•  set a as 3
•  set b as "Hello!"
•  set c as true
Using Variables: Every variable can hold three types of values: numerics, text, and boolean(true/false). This is how you can access these properties:

•  a.num: Gives the numeric value of the variable. The default value is 0.
•  a.txt: Gives the textual value of the variable. The default value is "".
•  a.bool: Gives the boolean(true/false) value of the varaiable. The default value is false.

4.KNOWN ISSUES

•  Threading not supported
•  Exception Handling not yet supported
•  No built in 'integer' type
•  'Window' class in myAPI clashes with 'Window' class of awt
->You can overcome the integer problem by typecasting the '.num' property of the variable. For example: (int)a.num would return the integer value of a.
->You can also overcome the 'Window' problem by importing only the awt classes that you are using, instead of importing all of them. For instance, instead of writing import java.awt.*, you could write import java.awt.Button.

5.OTHER STUFF
You can go through the sample programs provided with this package to understand other features of the language.
I would recommend you to download Notepad++ from the net, and use the 'Anello.xml' file supplied with this package to set up a coding environment for yourself.
Otherwise, you can use 'Wordpad' supplied by Microsoft. Just don't use the basic Notepad. It ruins the tabbing.
Document Content
The language is simple, trying to be natural, encourage organization and comes with transparent and visual implementation. It comes with compact syntax and a group of features that enable the programmer to create natural interfaces and declarative domain-specific languages in a fraction of time. It is very small, fast programmer control. It supports many programming paradigms, comes with useful and practical libraries. The language is designed for productivity and developing high quality solutions that can scale.
Designed for a Clear Goal
•	Applications programming language.
•	Productivity and developing high quality solutions that can scale.
•	Small and fast language that can be embedded in OOPS projects.
•	Simple language that can be used in education and introducing Compiler/VM concepts.
•	General-Purpose language that can be used for creating domain-specific libraries, frameworks and tools.


Anello is a very simple language, and has a very straightforward syntax. It encourages programmers to program without boilerplate code.

print "Hello, World!" 

The Main function is not presented in anello instead of this there is a start and end keywords are present. All the statements will be executed in between these two statements, and is useful for using the global scope.

start 
Stmt-1
Stmt-2
end 


Trying to be natural
Anello is  case-sensitive
print "Enter your name ? " 
take name
print "Hello " + name.txt	# if we give Name instead of name will get an error because anello is  fully case-sensitive.


We can write one line comments and multi-line comments 
Here no need to use /* or // or * Anello allow us to directly write number of lines comments Because it consider only start and end and keywords.

Compact Syntax
The language is  line sensitive, you don't need to write ; after statements, we need to press ENTER or TAB, so we can write the next code.
Don’t need to write { and } within program instead of this use tabs for one tab indicates one curely brace end brace indicated by end keyword.
print " Another message in the same line! " + nl
print "Enter your name?" 
take Name 
print "Hello " + Name


Thank You


