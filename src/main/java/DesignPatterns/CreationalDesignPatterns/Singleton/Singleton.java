package DesignPatterns.CreationalDesignPatterns.Singleton;

    /*
Singleton Pattern: Brief Notes
The Singleton pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to that instance.

Key Concepts
    Single Instance: The primary purpose of the Singleton pattern is to ensure that a class has only one instance throughout the application's lifecycle.
    Global Access Point: The pattern provides a global access point to that instance, typically through a static method.
Implementation

Example
*/

public class Singleton {
    // Static variable that holds the single instance
    private static Singleton instance;

//    Eager Initialization:
//    private static final Singleton instance = new Singleton();  and just return instance from getInstance method

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
/*


Advantages
    Controlled Access: Ensures control over the instance, especially in scenarios where you need
        exactly one instance (e.g., database connection).
    Reduced Memory Usage: Avoids unnecessary creation of multiple instances.
    Global Access: Provides a single point of access, simplifying the interface for users of the class.

Disadvantages
    Global State: The Singleton instance can introduce global state into an application, making it harder to manage and test.
    Single Responsibility Principle Violation:  Combining instance control and the class's primary functionality can violate the Single Responsibility Principle.
    Concurrency Issues: Proper handling is required in multi-threaded environments to avoid issues related to concurrent access.
        //TODO: we can fix this using double locking
Usage
    Configuration Settings:Ensuring a single source of truth for configuration settings across an application.
    Logging:A single logging instance to ensure consistent logging throughout the application.
    Caching: A centralized cache that can be accessed globally.

    */