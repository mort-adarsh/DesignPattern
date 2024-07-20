package OtherDesignPattern.RateLimiter.TokenBucket2;

import java.util.Random;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(3,5);
        for(int i =0; i<10; i++){
            if(rateLimiter.excute("Adarsh")) {
                System.out.println("granted");
            }else {
                System.out.println("Denied");
            }
            System.out.println("");
            Thread.sleep(200);
        }
    }
}
