## Flyweight design pattern:

The Flyweight pattern is a structural design pattern that aims to minimize memory usage or resource consumption by sharing common parts of objects among multiple objects. It is used to manage a large number of fine-grained objects efficiently.

### Key Components:

#### **Flyweight**: 
- Represents a shared object that contains intrinsic (shared) state. Multiple objects can use the same flyweight object.
#### **Concrete Flyweight**: 
- Concrete Flyweight: Implements the Flyweight interface and stores the intrinsic state that is shared among multiple objects.
#### **Flyweight Factory**:
- Creates and manages flyweight objects. It ensures that shared flyweights are reused and new flyweights are created when needed.
#### **Client**:
- Uses flyweight objects and may provide extrinsic (unshared) state to the flyweight objects. 

### Intrinsic and Extrinsic States:

**Intrinsic State**: Part of the flyweight object that can be shared and remains constant across different contexts.

**Extrinsic State**: Part of the flyweight object that varies between different contexts and cannot be shared.

### Use Cases:

- Managing a large number of similar objects efficiently.
- Optimizing memory usage by sharing common parts of objects.
- Improving performance by reducing the creation of redundant objects.

### Benefits:

**Reduced memory usage**: Sharing common parts reduces the overall memory footprint.

**Improved performance**: Reusing shared flyweights avoids redundant object creation.

**Flexible**: Allows for both shared (intrinsic) and unique (extrinsic) states in objects.
- **Example Scenario**: Consider a text editor application where each character in a document is a flyweight object. The font and size of the character represent the intrinsic state (shared among characters), while the position of the character on the document represents the extrinsic state (unique for each character).

### Implementation Tips:

1. Identify the parts of objects that can be shared (intrinsic state) and those that vary (extrinsic state).
2. Use a flyweight factory to manage shared flyweights and create new flyweights when needed.
3. Ensure that clients provide the extrinsic state to flyweight objects when required.
4. Overall, the Flyweight pattern is useful for optimizing resource usage in situations where many objects share common properties or characteristics.

### Drawbacks:

- **Increased complexity**: Managing shared and unique states may add complexity, especially for complex objects.

- **Thread safety concerns**: If flyweight objects are mutable and shared across threads, concurrency issues may arise.

### NOTE
Below pattern also get used with flyweight pattern.
- **Singleton Pattern**: May be used in conjunction with Flyweight to manage shared resources.

- **Factory Method Pattern**: Often used to create flyweight objects within a factory hierarchy.