package DesignPatterns.CreationalDesignPatterns.Singleton;


/*
the Bill Pugh Singleton pattern is widely regarded as one of the most effective and straightforward ways to implement a Singleton in Java.
It leverages the class initialization phase to ensure that the instance is created in a thread-safe manner without the need for
synchronization overhead during access. Here’s a recap of the Bill Pugh Singleton pattern:

 */

public class Singleton3 {
    // Private constructor to prevent instantiation
    private Singleton3() {}

    // Static inner helper class responsible for holding the Singleton instance
    private static class SingletonHelper {
        // The Singleton instance is created only when the SingletonHelper class is loaded
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    // Public method to provide access to the Singleton instance
    public static Singleton3 getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Other methods of the Singleton class
    public void someMethod() {
        // Your method implementation
    }
}

/*
Why the Bill Pugh Singleton Pattern is Effective

Lazy Initialization: The instance is created only when the getInstance method is called for the first time, ensuring lazy initialization.

Thread Safety: The class loader mechanism ensures that the instance is created in a thread-safe manner.
The Java language guarantees that a class is only loaded once, and this occurs when it is first accessed.

No Synchronization Overhead: Unlike the synchronized method approach, this pattern does not incur the performance penalty associated
with synchronization once the instance is initialized.

Are There Any Issues?
The Bill Pugh Singleton pattern is considered very robust, but it's important to consider a few points:

Serialization: If your Singleton class implements Serializable, you need to ensure that the same instance is returned after deserialization.
This can be achieved by implementing the readResolve method.
code:
private Object readResolve() {
    return SingletonHelper.INSTANCE;
}


Reflection: Singleton instances can be compromised using reflection to invoke the private constructor.
To prevent this, you can modify the constructor to throw an exception if an instance already exists.

code:
private Singleton() {
    if (SingletonHelper.INSTANCE != null) {
        throw new IllegalStateException("Already instantiated");
    }
}


Cloning: If your Singleton class implements Cloneable, you need to override the clone method to prevent the creation of another instance.

code:
@Override
protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
}

Conclusion
The Bill Pugh Singleton pattern is a clean and efficient way to implement a Singleton in Java. It ensures lazy initialization,
thread safety, and avoids synchronization overhead. While it is highly robust, you should still be mindful of potential issues
related to serialization, reflection, and cloning, and take steps to address these if applicable to your use case.
 */