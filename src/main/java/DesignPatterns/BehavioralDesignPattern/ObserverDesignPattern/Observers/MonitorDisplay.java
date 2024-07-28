package DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observers;


public class MonitorDisplay implements Observer {
    int temp;
    int humidity;

//    public MonitorDisplay(int humidity, int temp) {
//        this.humidity = humidity;
//        this.temp = temp;
//    }

    void display(){
        System.out.println("Monitor: Current temp:- "+temp + ", humidity:- "+humidity);
    }


    @Override
    public void update(int temp, int humidity) {
        this.humidity = humidity;
        this.temp = temp;
        display();
    }
}
