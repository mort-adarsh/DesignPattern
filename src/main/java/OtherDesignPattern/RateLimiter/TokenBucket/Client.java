package OtherDesignPattern.RateLimiter.TokenBucket;

public class Client {

    // Example usage of Rate Limiter
    public static void main(String[] args) throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(10, 3); // Allow 3 requests per second, up to a burst of 10

        // Simulate multiple requests from different clients
        simulateRequests(rateLimiter, "client1", 5);// 5 requests from client1
        System.out.println("-----------------------------------------------------------------");
        simulateRequests(rateLimiter, "client2", 10); // 10 requests from client2
        System.out.println("-----------------------------------------------------------------");
        simulateRequests(rateLimiter, "client1", 10); // 10 more requests from client1
        System.out.println("-----------------------------------------------------------------");
        simulateRequests(rateLimiter, "client2", 5);
    }

    private static void simulateRequests(RateLimiter rateLimiter, String clientKey, int numRequests) throws InterruptedException {
        for (int i = 0; i < numRequests; i++) {
            boolean allowed = rateLimiter.allowRequest(clientKey);
            //System.out.println("Request from " + clientKey + ": " + (allowed ? "Allowed" : "Denied"));
            Thread.sleep(50); // Simulate requests every 300 milliseconds
        }
    }
}
