## Decorator Design Pattern
The Decorator Design Pattern is a structural pattern that allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class. This pattern is typically used to adhere to the Single Responsibility Principle by allowing functionality to be divided between classes with unique areas of concern.

### Key Concepts
- **Component**: The base interface or abstract class that defines the operations which can be altered by decorators.

- **ConcreteComponent**: The original object to which additional responsibilities can be added.


- **Decorator**: An abstract class implementing the Component interface and containing a reference to a Component object. It delegates all the operations to the Component object it decorates.


- **ConcreteDecorator**: A class that extends the Decorator class and adds responsibilities to the Component object.

```dtd
     -------------------
    |     Component     |
    |-------------------|
    |   + operation()   |
     -------------------
              /\
              |
     --------------------
    | ConcreteComponent |
    |-------------------|
    |   + operation()   |
     --------------------
              |
              |
     -------------------------
    |        Decorator       |
    |------------------------|
    | - component: Component |
    | + operation()          |
     -------------------------
              /\
              |
     -------------------------
    |   ConcreteDecorator    |
    |------------------------|
    | + operation()          |
    | + addedBehavior()      |
     -------------------------

```
### Key Points
- **Flexibility** Decorators provide a flexible alternative to subclassing for extending functionality.


- **Single Responsibility Principle**: By using decorators, you can divide functionalities into separate classes with unique responsibilities.


- **Open/Closed Principle**: Classes are open for extension but closed for modification. You can add new functionality without altering existing code.

### Use Cases
- Adding functionalities to objects dynamically and transparently.


- Extending functionalities of a class in a flexible and reusable way.


- Replacing inheritance with composition to avoid an explosion of subclasses.


- The Decorator Pattern is particularly useful when you need to add responsibilities to objects at runtime and you want to avoid the complexity associated with subclassing.






