package DesignPatterns.CreationalDesignPatterns.Singleton;


/* Double-Checked Locking:
Double-checked locking is a design pattern used to reduce the overhead of acquiring a lock by first testing the
locking criterion (the "double-check") without actually acquiring the lock. Only if the locking criterion check
indicates that locking is required does the actual lock proceed.

In the context of the Singleton pattern, double-checked locking ensures that the singleton instance is created
in a thread-safe manner while avoiding the performance hit associated with synchronized methods.

Problem It Solves
    The Singleton pattern needs to ensure that only one instance of the class is created and that it is created in a thread-safe manner.
    The simplest way to do this in Java is to use synchronized methods, but this can be inefficient because it forces every call to
    getInstance() to be synchronized, even when the instance is already created.

Double-checked locking aims to reduce this overhead by synchronizing only the first time the instance is created.

How It Works
    First Check (Without Locking): The first check is done without acquiring the lock. If the instance is already created, it is returned immediately, avoiding the overhead of synchronization.
    Synchronized Block: If the instance is not created, the code enters a synchronized block. This ensures that only one thread can create the instance.
    Second Check (Within Lock): Inside the synchronized block, the instance is checked again. This second check ensures that the instance was not created by another thread while the current thread was waiting to acquire the lock.
    Instance Creation: If the instance is still null, it is created and assigned.

Implementation:
 */
public class Singleton2 {
    /* The volatile keyword ensures that changes to the instance variable are visible to all threads.  it flushes the value
            to the main memory,and when another thread reads it, it reads from the main memory.
       It prevents subtle problems caused by the Java Memory Model's reordering of instructions.
     */
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