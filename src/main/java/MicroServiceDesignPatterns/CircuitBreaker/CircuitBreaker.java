package MicroServiceDesignPatterns.CircuitBreaker;

import java.util.concurrent.atomic.AtomicInteger;

// Example Circuit Breaker class
class CircuitBreaker {
    private static final int FAILURE_THRESHOLD = 3;
    private static final long TIMEOUT_THRESHOLD = 2000; // 2 seconds in milliseconds

    private AtomicInteger failureCount = new AtomicInteger(0);
    private long lastFailureTimestamp = 0;
    private State currentState = State.CLOSED;

    public String performRequest(ExampleService service) {
        try {

            if (currentState == State.OPEN) {
                if(isTimeoutExpired()){
                    reset();
                }else return fallback();
            }

            // Perform the request
            String result = service.performRequest();

            // Reset failure count on successful execution
            reset();
            return result;
        } catch (Exception e) {
            handleFailure();
            return fallback();
        }
    }

    private synchronized void handleFailure() {
        failureCount.incrementAndGet();
        if (currentState == State.CLOSED && failureCount.get() >= FAILURE_THRESHOLD) {
            currentState = State.OPEN;
            lastFailureTimestamp = System.currentTimeMillis();
            System.out.println("Circuit Breaker opened due to too many failures.");
        }
    }

    private synchronized void reset() {
        failureCount.set(0);
        currentState = State.CLOSED;
        System.out.println("Circuit Breaker reset to CLOSED state.");

    }

    private String fallback() {

        if (currentState == State.OPEN) return "Circuit is open";
        return "Fallback response - Service is currently unavailable.";
    }

    private synchronized boolean isTimeoutExpired() {
        return (System.currentTimeMillis() - lastFailureTimestamp) > TIMEOUT_THRESHOLD;
    }

    private enum State {
        CLOSED, OPEN
    }
}