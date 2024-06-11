package DesignPatterns.CreationalDesignPatterns.FactoryPattern;

interface Transport {
        void deliver();
    }


class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by land in a box.");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by sea in a container.");
    }
}