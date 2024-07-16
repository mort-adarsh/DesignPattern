## Proxy Design Pattern
The Proxy Design Pattern is a structural pattern that provides a surrogate or placeholder for another object to control access to it. This pattern helps in managing access, enhancing functionality, or adding a level of abstraction to another object.

### Key Concepts
- **Proxy**: An object that acts as an intermediary for accessing the real object.


- **RealSubject**: The actual object that the proxy represents.


- **Subject**: An interface common to both the RealSubject and the Proxy, so the proxy can be used anywhere the real subject is expected.

### Types of Proxy
1. **Virtual Proxy**: Controls access to a resource that is expensive to create.


2. **Protection Proxy**: Controls access to a resource based on access rights.


3. **Remote Proxy**: Represents an object in a different address space.


4. **Caching Proxy**: Provides temporary storage for results of expensive operations.


5. **Smart Proxy**: Provides additional functionality, such as reference counting.

```dtd
     -----------------------------
    |          Subject           |
    |----------------------------|
    |        + request()         |
     -----------------------------
                 /\
                 |
     -----------------------------
    |        RealSubject         |
    |----------------------------|
    |       + request()          |
     -----------------------------
                 /\
                 |
     -----------------------------
    |           Proxy            |
    |----------------------------|
    | - realSubject: RealSubject |
    |       + request()          |
     -----------------------------

```

### Key Points
**Control Access**: Proxies control access to the real object, which can add a layer of security.

**Lazy Initialization**: Proxies can delay the creation and initialization of expensive objects until they are needed.

**Logging and Monitoring**: Proxies can be used to log calls to the real object, or to monitor the usage of an object.

**Caching**: Proxies can cache results of expensive operations to improve performance.

### Use Cases
- Security: Control access to sensitive objects.
- Lazy Initialization: Delay expensive object creation until absolutely necessary.
- Logging: Keep track of the operations performed on an object.
- Remote Access: Represent an object in a different address space.
- Smart Reference: Perform additional actions when an object is accessed.
- The Proxy Design Pattern is particularly useful when you need a representative or placeholder for another object, offering controlled access, adding a level of indirection, or introducing additional functionalities.






