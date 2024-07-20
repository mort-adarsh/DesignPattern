package MicroServiceDesignPatterns.CircuitBreaker;

// Example implementation of the service
class ExampleServiceImpl implements ExampleService {
    private int counter = 0;

    @Override
    public String performRequest() {
        counter++;
        // Simulate service behavior - succeed for the first 3 calls, then fail
        if (counter <= 3) {
            return "Service response #" + counter;
        } else {
            throw new RuntimeException("Service failure");
        }
    }
}