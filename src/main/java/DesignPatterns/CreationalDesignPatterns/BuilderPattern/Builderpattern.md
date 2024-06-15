## The Builder design pattern

The Builder design pattern is a creational design pattern that provides a way to construct a complex object step by step. 
It allows the creation of different representations of an object using the same construction process. 
This pattern is particularly useful when an object requires multiple steps to be created or when the creation process involves conditional steps or multiple configurations.


## Key Concepts

**Builder Interface**: Declares methods for creating different parts of a Product object.

**Concrete Builder**: Implements the Builder interface and constructs and assembles parts of the product.

**Product**: The complex object being constructed.

**Director**: Constructs an object using the Builder interface.

## UML Diagram
Here's an example UML diagram for the Builder design pattern:
```dtd
+-------------------+                 +-------------------+
|      Director     |                 |      Product      |
+-------------------+                 +-------------------+
| - builder: Builder|<------------+   | - partA: TypeA    |
| + construct():    |             |   | - partB: TypeB    |
|    Product        |             |   +-------------------+
+-------------------+             |
             |                    |
             v                    |
+-------------------+             |
|      Builder      |<------------+
+-------------------+
| + buildPartA()    |
| + buildPartB()    |
| + getResult():    |
|   Product         |
+-------------------+
             |
             v
+-------------------+
|  ConcreteBuilder  |
+-------------------+
| - product: Product|
| + buildPartA()    |
| + buildPartB()    |
| + getResult():    |
|   Product         |
+-------------------+


```

## Pros:

**Separation of Concerns**: The construction code is separated from the representation.
**Flexibility**: Allows different representations for the same construction process.          
**Control**: The construction process can be controlled step by step.

## Cons:

**Complexity**: Can make the design more complex with more classes.    
**Overhead**: May not be worth the overhead for simpler objects.

### When to Use
- When the construction process of an object is complex.
- When the construction process must allow different representations.
- When the construction process involves multiple steps that can be customized.