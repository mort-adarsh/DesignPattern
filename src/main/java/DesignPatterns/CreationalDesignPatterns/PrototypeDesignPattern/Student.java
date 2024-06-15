package DesignPatterns.CreationalDesignPatterns.PrototypeDesignPattern;


import java.util.ArrayList;
import java.util.List;

public class Student implements HumanPrototype{

    private Integer rollNumber;
    private String name;
    private List<String> courses;

    public Student(Integer rollNumber, String name, List<String> courses) {
        this.rollNumber = rollNumber;
        this.name = name;
        // Create a mutable list
        this.courses = new ArrayList<>(courses);
    }


    // For shallow
    @Override
    public HumanPrototype clone() {
        try {
            return (HumanPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("You haven't implemented using cloneable interface");
            throw new RuntimeException("Errrrrorrr");
        }
    }

    // for deep copy
    @Override
    public HumanPrototype clone2() {
        try {
            Student cloned = (Student) super.clone();
            // Ensure deep copy of mutable list
            cloned.courses = new ArrayList<>(this.courses);
            return cloned;
        } catch (CloneNotSupportedException e) {
            System.out.println("You haven't implemented using cloneable interface");
            throw new RuntimeException("Errrrrorrr");
        }
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
