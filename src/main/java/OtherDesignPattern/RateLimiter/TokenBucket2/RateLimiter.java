package OtherDesignPattern.RateLimiter.TokenBucket2;

import java.util.HashMap;
import java.util.Map;

public class RateLimiter {

    Map<String,TokenBucket> tokens = new HashMap<>();
    int capacity;
    int rate;

    public RateLimiter(int rate, int capacity) {
        this.capacity = capacity;
        this.rate = rate;
    }

    public boolean excute(String user) {
        if(!tokens.containsKey(user)){
            tokens.put(user, new TokenBucket(rate, capacity));
        }
        TokenBucket tokenBucket = tokens.get(user);
        if(tokenBucket.useToken()){
            driver();
            return true;
        }
        return false;
    }



    private void driver(){
        System.out.println("Request recived");
    }

}
