package DesignPatterns.Singleton;

## Singleton Pattern: Brief Notes
The Singleton pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to that instance.

### Key Concepts
#### Single Instance: 
The primary purpose of the Singleton pattern is to ensure that a class has only one instance throughout the application's lifecycle.
#### Global Access Point: 
The pattern provides a global access point to that instance, typically through a static method.
Implementation

Example
```

public class Singleton {
// Static variable that holds the single instance
private static Singleton instance;

    // Private constructor to prevent instantiation the Singleton class.
    private Singleton() {}

    // Public static method that returns the single instance
    public static Singleton getInstance() {

        //Ensures that the instance is created safely in a multi-threaded environment.
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### Advantages
#### Controlled Access: Ensures control over the instance, especially in scenarios where you need
exactly one instance (e.g., database connection).
#### Reduced Memory Usage: Avoids unnecessary creation of multiple instances.
#### Global Access: Provides a single point of access, simplifying the interface for users of the class.

### Disadvantages
#### Global State: The Singleton instance can introduce global state into an application, making it harder to manage and test.
#### Single Responsibility Principle Violation:  Combining instance control and the class's primary functionality can violate the Single Responsibility Principle.
#### Concurrency Issues: Proper handling is required in multi-threaded environments to avoid issues related to concurrent access.
- we can fix this using double locking 

### Usage
#### Configuration Settings:Ensuring a single source of truth for configuration settings across an application.
#### Logging:A single logging instance to ensure consistent logging throughout the application.
#### Caching: A centralized cache that can be accessed globally.

## Double-Checked Locking:
Double-checked locking is a design pattern used to reduce the overhead of acquiring a lock by first testing the
locking criterion (the "double-check") without actually acquiring the lock. Only if the locking criterion check
indicates that locking is required does the actual lock proceed.

In the context of the Singleton pattern, double-checked locking ensures that the singleton instance is created
in a thread-safe manner while avoiding the performance hit associated with synchronized methods.

### Problem It Solves
The Singleton pattern needs to ensure that only one instance of the class is created and that it is created in a thread-safe manner.
The simplest way to do this in Java is to use synchronized methods, but this can be inefficient because it forces every call to
getInstance() to be synchronized, even when the instance is already created.

Double-checked locking aims to reduce this overhead by synchronizing only the first time the instance is created.

### How It Works
- First Check (Without Locking): The first check is done without acquiring the lock. If the instance is already created, it is returned immediately, avoiding the overhead of synchronization.
- Synchronized Block: If the instance is not created, the code enters a synchronized block. This ensures that only one thread can create the instance.
- Second Check (Within Lock): Inside the synchronized block, the instance is checked again. This second check ensures that the instance was not created by another thread while the current thread was waiting to acquire the lock.
- Instance Creation: If the instance is still null, it is created and assigned.

Implementation:
```
public class Singleton2 {

private static volatile Singleton2 instance;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (instance == null) {
            /// If the instance is null, the code enters a synchronized block, ensuring that only one thread can execute this block at a time.
            synchronized (Singleton2.class) {
                if (instance == null) {
                    //If the instance is still null after the second check, it is created and assigned to the instance variable.
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
```
