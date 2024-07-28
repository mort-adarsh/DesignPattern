package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in a MacOS style.");
    }
}