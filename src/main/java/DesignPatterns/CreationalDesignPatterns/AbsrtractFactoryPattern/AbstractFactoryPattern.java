package DesignPatterns.CreationalDesignPatterns.AbsrtractFactoryPattern;

public class AbstractFactoryPattern {
    private static Application configureApplication(String osName) {
        Application app;
        GUIFactory factory;

        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication("mac");
        app.paint();
    }
}