package DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern;




public class TvDisplay implements Observer{
    int temp;
    int humidity;

//    public TvDisplay(int humidity, int temp) {
//        this.humidity = humidity;
//        this.temp = temp;
//    }

    void display(){
        System.out.println("TV: Current temp: "+temp + "humidity: "+humidity);
    }


    @Override
    public void update(int temp, int humidity) {
        this.humidity = humidity;
        this.temp = temp;
        display();
    }
}
