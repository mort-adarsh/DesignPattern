## Strategy Design Pattern
The Strategy Design Pattern, also known as the Policy Pattern, is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. Instead of implementing a single algorithm directly, the code receives runtime instructions on which in a family of algorithms to use.

### Key Concepts
1. Context: The class that uses a Strategy.
2. Strategy: The interface common to all concrete strategies.
3. ConcreteStrategy: Classes that implement the Strategy interface.

### When to Use
- When you have multiple algorithms for a specific task and you want the application to be flexible to switch between them.

- When you want to avoid multiple conditional statements for selecting the algorithm.

### Advantages
- **Open/Closed Principle**: You can introduce new strategies without changing the context.


- **Encapsulation**: Strategy pattern encapsulates each algorithm into its own class.



- **Interchangeable Algorithms**: Easy to switch between different strategies.

### Disadvantages
- Increased number of classes and objects in the system.

- Clients must be aware of different strategies.

## UML Diagram:-

```dtd
+-------------------------+         +------------------------+
|        Context          |         |        Strategy        |
|-------------------------|         |------------------------|
| -  strategy:  Strategy  |<------->|     +Algorithm()       |
|    other varibles       |         +------------------------+
|                         |            |                 |
|-------------------------|            |                 |
|   +setStrategy()        |            |                 |
|   +execute()            |            |                 |
|   +otherOperations()    |            |                 |
+-------------------------+            |                 |
                                       |                 |
                          +---------------------+       +---------------------+
                          | ConcreteStrategyB   |       | ConcreteStrategyA   |
                          |---------------------|       |---------------------|
                          |  +Algorithm()       |       |  +Algorithm()       |
                          +---------------------+       +---------------------+
                            

```