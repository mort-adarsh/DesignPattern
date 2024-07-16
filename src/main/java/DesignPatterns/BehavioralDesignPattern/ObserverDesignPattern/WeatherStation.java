package DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern;


import java.util.logging.Logger;

public class WeatherStation {
    //private static final Logger logger = Logger.getLogger(WeatherStation.class.getName());


    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(new TvDisplay());
        weatherData.setWeatherData(37,67);

        System.out.println("--------------------------------------------");
        weatherData.addObserver(new MonitorDisplay());
        weatherData.setWeatherData(37,67);
    }
}
