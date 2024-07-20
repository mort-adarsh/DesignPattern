package OtherDesignPattern.RateLimiter.TokenBucket2;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

public class TokenBucket {

    private int rate;
    private int capacity;
    private int freetoken;
    private Instant lastTokenConsumedTime;
    private static final int maxTokenAllowed = 100;
    private static final AtomicInteger currentTokensInUse = new AtomicInteger(0);

    public TokenBucket(int rate, int capacity) {
        this.rate = rate;
        this.capacity = capacity;
        this.freetoken = rate;
        lastTokenConsumedTime = Instant.now();
    }

    public Boolean useToken(){
        Instant now = Instant.now();
        refill(now);
        if(freetoken>0) {
            int currentUsage = currentTokensInUse.incrementAndGet();
            if (currentUsage > maxTokenAllowed) {
                // Exceeds max limit, revert usage
                currentTokensInUse.decrementAndGet();
                return false;
            }
            freetoken--;
            lastTokenConsumedTime = now;
            return true;
        }
        return false;
    }

    private void refill(Instant now) {
        long timeElapsed = now.getEpochSecond() - lastTokenConsumedTime.getEpochSecond();
        if(timeElapsed != 0){
            freetoken = (int) Math.min(freetoken+timeElapsed*rate, capacity);
        }
    }

}
