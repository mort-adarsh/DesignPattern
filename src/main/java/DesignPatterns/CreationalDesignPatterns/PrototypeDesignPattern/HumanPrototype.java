package DesignPatterns.CreationalDesignPatterns.PrototypeDesignPattern;

// If ypu don't extend Cloneable, you will get CloneNotSupportedException.
public interface HumanPrototype extends Cloneable{

     HumanPrototype clone();

     HumanPrototype clone2();
}
