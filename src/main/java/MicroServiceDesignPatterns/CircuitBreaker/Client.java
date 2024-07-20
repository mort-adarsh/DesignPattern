package MicroServiceDesignPatterns.CircuitBreaker;



// Example usage of the Circuit Breaker
public class Client {

    public static void main(String[] args) {
        ExampleService service = new ExampleServiceImpl();
        CircuitBreaker circuitBreaker = new CircuitBreaker();

        // Simulate service calls
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            String response = circuitBreaker.performRequest(service);
            System.out.println("Response from service: " + response);
            try {
                Thread.sleep(1000); // Simulate delay between requests
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

