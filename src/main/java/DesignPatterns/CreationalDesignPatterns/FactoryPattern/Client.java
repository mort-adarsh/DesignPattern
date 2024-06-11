package DesignPatterns.CreationalDesignPatterns.FactoryPattern;


import java.util.Scanner;

public class Client {
    private static Logistics logistics;

    private static FactoryDesignPattern factory = new FactoryDesignPattern();

    public void merchant() {
        try {
            System.out.println("Enter transport type (land/sea): ");
            Scanner scanner = new Scanner(System.in);
            String raste = scanner.nextLine();
            scanner.close();
            logistics = factory.configure(raste);
            logistics.planDelivery();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.merchant();
    }
}
