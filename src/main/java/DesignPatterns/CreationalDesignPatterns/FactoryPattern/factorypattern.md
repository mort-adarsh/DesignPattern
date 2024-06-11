# Factory Pattern
The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

## Intent
The main intent of the Factory Pattern is to define an interface for creating objects, but let subclasses decide which class to instantiate. It promotes loose coupling by separating object creation from object usage.

## Key Components
### Factory Interface or Abstract Class: 
- Declares the factory method(s) for creating objects. It may also contain default implementations.
### Concrete Factory Classes: 
- Implement the factory interface/abstract class to provide specific implementations of the factory method(s).
### Product Interface or Abstract Class: 
- Defines the interface for the products that the factory will create.
### Concrete Product Classes: 
- Implement the product interface/abstract class to provide specific implementations of the products.

## Advantages
#### Flexibility: 
Allows adding new products or changing existing ones without modifying client code.
#### Encapsulation: 
Encapsulates object creation logic in separate classes, promoting modular code.
#### Decouples Code: 
Clients interact with the factory interface rather than directly with concrete classes, reducing dependencies.
#### Code Reusability: 
Factories can be reused across different parts of the application.
#### Easy Testing: 
Mocking or stubbing factories is straightforward, aiding in testing.

## Cons of Factory Pattern:
- **Complexity**: Introducing multiple factory classes can add complexity to the codebase.
- **Increased Code Overhead**: Requires creating additional classes for factories and products, which can increase code volume.
- **Runtime Selection Overhead**: If factories are determined at runtime, there might be a slight performance overhead.


### Use Cases
- When a system needs to be independent of how its objects are created, composed, and represented.
- When a system needs to support multiple types of objects with a common interface.
- When the client code should not be concerned with the details of object creation.