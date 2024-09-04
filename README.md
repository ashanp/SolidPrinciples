This project will demonstrate the use of SOLID principles when developing 
Object oriented programing 
S - Single Responsibility 
O - Open for extension, Closed for modification
L - Liskov Principle 
I - Interface Segregation 
D - Dependency Inversion 

S - Single Responsibility Principle (SRP)
-----------------------------------------
Any class at a given time will only have a singe responsibility of work. Mixing duties
with the same class would complicate the workspace and will be difficult the track the 
changes.

O - Open Close Principle (OCP) - Open for extension, Closed for modification
----------------------------------------------------------------------------
This specifies, that any class (classes, modules, functions, etc.) would not be modified directly but 
it will be its welcome to add extensions to it so enhance the class. We using (implement) interfaces to 
achieve this. 
please follow the package asperera.solid.ocp to understand the modification done. 

L - Liskov Substitution Principle (LSP)
---------------------------------------
The Liskov Substitution tells that the functions of the superclass must be inherited by the subclass
that would not logically malfunction. For example, all birds fly so the parent will have fly method.
But Ostrich is a bird but cannot fly, so LSP says this is not correct. So we have to correct this. 
Please check the correct implementation in package LSP 

I - Interface Segregation Principle (ISP)
----------------------------------------
No client should be forced to depend on a interface where it is not used. Instead, what is needed is to
split the interface into smaller more specific interfaces that client only needs. Please check the correct 
implementation in package ISP

D - Dependency Inversion Principle (DIP) 
----------------------------------------
It states that high-level modules should not depend (tightly coupled) on low-level modules; both should 
depend on abstractions. Additionally, abstractions should not depend on details; details should depend 
on abstractions. This helps in decoupling the code and makes it more maintainable and flexible.
EX:- a Mouse and a Keyboard should not depend on a computer. If we use a wireless Keyboard or Mouse then
we have to change the computer. therefore we need to use interfaces to do theses. 


