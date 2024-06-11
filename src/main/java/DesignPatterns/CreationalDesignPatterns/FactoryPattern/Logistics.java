package DesignPatterns.CreationalDesignPatterns.FactoryPattern;

abstract class Logistics {
        // The factory method
        public abstract Transport createTransport();

        public void planDelivery() {
            // Call the factory method to create a Transport object
            Transport transport = createTransport();
            // Use the transport object
            transport.deliver();
        }
    }

class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}