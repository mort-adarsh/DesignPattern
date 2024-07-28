package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in a Windows style.");
    }
}
