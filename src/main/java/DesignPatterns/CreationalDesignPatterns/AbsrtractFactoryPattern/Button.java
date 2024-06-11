package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern;

interface Button {
    void paint();
}

class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in a Windows style.");
    }
}

class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in a MacOS style.");
    }
}