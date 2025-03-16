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


**CUPID principles**

The **CUPID principles** were introduced by **Dan North** as a modern alternative to **SOLID** principles, aiming to provide a more intuitive and practical approach to writing maintainable and scalable software. CUPID focuses on making software **joyful to work with**, prioritising simplicity and maintainability over rigid rules.

### **Breaking Down CUPID Principles**  

1. **Composable**  
   - Software should be **modular**, meaning small parts can be combined in different ways.  
   - Functions, classes, and services should be **loosely coupled** and **easily reusable**.  
   - Example:  
     - Instead of a large, monolithic function, break logic into **small, independent** functions that can be combined as needed.  
     - Microservices are a great example—they can work independently but integrate seamlessly when needed.  

2. **Unix Philosophy**  
   - Inspired by the **Unix operating system** philosophy: *"Do one thing and do it well."*  
   - Each component should have a **single responsibility** and focus on solving one problem efficiently.  
   - Example:  
     - A function that **only** fetches data, instead of one that fetches, processes, and displays it.  
     - Using command-line utilities that can be combined using pipes (`|`) in Unix/Linux systems.  

3. **Predictable**  
   - Code should **behave consistently** across different inputs and environments.  
   - Avoid **hidden side effects** and **unnecessary complexity** that makes debugging hard.  
   - Example:  
     - A function should **always return the same output** for the same input.  
     - Avoid unpredictable behaviours like modifying global variables inside a function.  

4. **Idiomatic**  
   - Follow the **conventions** and **best practices** of the programming language or framework you are using.  
   - This makes code more **readable** and **maintainable** for developers familiar with the language.  
   - Example:  
     - In Python, use **list comprehensions** instead of `for` loops when filtering a list (`[x for x in my_list if x > 10]`).  
     - In Java, use **Streams API** instead of old-style `for` loops when processing collections.  

5. **Domain-Based**  
   - Software should be **designed around the business domain**, not just technical implementation.  
   - Use **meaningful names** and **domain-driven design (DDD)** concepts.  
   - Example:  
     - Instead of using generic terms like `Processor` or `Manager`, use domain-specific names like `InvoiceGenerator` or `PaymentProcessor`.  
     - Use **event-driven architecture** in domains where it makes sense (e.g., an **OrderPlaced** event in an e-commerce system).  

---

### **How Does CUPID Compare to SOLID?**  
| Aspect        | SOLID Principles | CUPID Principles |
|--------------|----------------|----------------|
| Focus        | Object-oriented design | General software design (not limited to OOP) |
| Complexity   | More formal and rigid | More intuitive and flexible |
| Scope        | Applied mostly to classes and objects | Applied at **function, class, and system levels** |
| Philosophy   | Avoids code smells by enforcing constraints | Encourages **joyful and simple** code |

### **Why Use CUPID?**
- Encourages **pragmatic** coding instead of blindly following rules.  
- Works for **functional, procedural, and OOP** programming styles.  
- Helps write **clear, reusable, and maintainable** code.  

CUPID is not about replacing SOLID but offering a more **developer-friendly** approach to software design, focusing on **joy** and **practicality** rather than strict adherence to rules.

Would you like some **real-world examples** of implementing CUPID in Java, Python, or any other language you use? 😊
