package DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern;


import DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observers.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherData {
    private List<Observer> observers;
    int temp;
    int humidity;

    public void setWeatherData(int temp, int humidity){
        this.humidity = humidity;
        this.temp = temp;
        notifyAlObserver();
    }

    public void addObserver(Observer obs){
        if(Objects.isNull(observers))
        {
            observers = new ArrayList<>();
        }
        observers.add(obs);
    }

    public void removeObserver(Observer obs){
        observers.remove(obs);
    }

    private void notifyAlObserver() {
        for (Observer observer:observers){
            observer.update(temp,humidity);
        }
    }


}
