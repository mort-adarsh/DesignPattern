package OtherDesignPattern.RateLimiter.TokenBucket;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Rate Limiter class using Token Bucket algorithm
public class RateLimiter {
    private final ConcurrentMap<String, TokenBucket> buckets = new ConcurrentHashMap<>();
    private final int capacity; // Max tokens in bucket
    private final int rate; // Tokens generated per second

    public RateLimiter(int capacity, int rate) {
        this.capacity = capacity;
        this.rate = rate;
    }

    // Method to check if a request is allowed
    public boolean allowRequest(String key) {
        TokenBucket bucket = buckets.computeIfAbsent(key, k -> new TokenBucket(capacity, rate));
        synchronized (bucket) {
            return bucket.tryConsume();
        }
    }

}