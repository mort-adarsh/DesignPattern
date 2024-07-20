package OtherDesignPattern.RateLimiter.TokenBucket;

import java.time.Instant;
import java.util.Random;

// Token Bucket class implementing token bucket algorithm
public class TokenBucket {
    private final int capacity; // Max tokens
    private final int rate; // Tokens generated per second
    private int tokens; // Current tokens in bucket
    private Instant lastRefill; // Last refill time

    public TokenBucket(int capacity, int rate) {
        this.capacity = capacity;
        this.rate = rate;
        this.tokens = capacity; // Start with full capacity
        this.lastRefill = Instant.now(); // Initialize last refill time
    }

    // Method to try consuming tokens from the bucket
    public synchronized boolean tryConsume() {
        refillTokens(); // Refill tokens since last check
        if (tokens > 0) {
            tokens--;
            return true; // Allow request if tokens available
        } else {
            return false; // Deny request if tokens not available
        }
    }

    // Method to refill tokens based on elapsed time
    private void refillTokens() {
        Instant now = Instant.now();
        long timeElapsed = now.getEpochSecond() - lastRefill.getEpochSecond();
        int tokensToAdd = (int) (timeElapsed * rate); // Calculate tokens to add based on elapsed time
        tokens = Math.min(tokens + tokensToAdd, capacity); // Add tokens respecting capacity
        lastRefill = now; // Update last refill time
    }
}