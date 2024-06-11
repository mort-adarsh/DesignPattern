## Abstract Factory Pattern: Quick Revision Notes
The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Key Components:
- **Abstract Factory**: Declares a set of methods for creating abstract products.
- **Concrete Factory**: Implements the abstract factory's methods to create concrete products.
- **Abstract Product**: Declares an interface for a type of product object.
- **Concrete Product**: Implements the abstract product interface.

```
        +--------------------+
        |   AbstractFactory  |
        |--------------------|
        | + createProductA() |
        | + createProductB() |
        +--------------------+
                  ^
                  |
        +---------+------------+
        |                      |
+--------------------+  +--------------------+
|  ConcreteFactoryA  |  |  ConcreteFactoryB  |
|------------------- |  |--------------------|
| + createProductA() |  | + createProductA() |
| + createProductB() |  | + createProductB() |
+--------------------+  +---------------------+
          |                       |
          v                       v
+--------------------+  +----------------------+
|  AbstractProductA  |  |  AbstractProductB    |
|--------------------|  |----------------------|
| + someMethod()     |  | + someMethod()       |
+--------------------+  +----------------------+
          ^                       ^
          |                       |
+---------+---------+   +---------+----------+
| ConcreteProductA1 |   | ConcreteProductB1  |
|-------------------|   |--------------------|
| + someMethod()    |   | + someMethod()     |
+-------------------+   +--------------------+
          | 
+-------------------+
| ConcreteProductA2 |
|-------------------|
| + someMethod()    |
+-------------------+

```

## Pros:
#### Encapsulation: Groups object families together.
#### Consistency: Ensures related objects are compatible.
#### Decoupling: Isolates client code from concrete classes.
## Cons:
#### Complexity: More classes and interfaces to manage.
#### Difficult to extend: Adding new product families requires changes to the abstract factory interface and all its concrete implementations.
## When to Use:
#### Multiple Families: When a system needs to support multiple families of products.
#### Consistency: Ensures consistency among products.
#### Configuration Change: Easily switch between different product families.
### Example Scenario:
- Suppose you have a GUI toolkit that supports multiple look-and-feel standards (e.g., Windows, macOS).