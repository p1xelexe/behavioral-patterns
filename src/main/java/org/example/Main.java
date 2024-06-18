package org.example;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();

        weatherData.registerObserver(currentConditionsDisplay);

        weatherData.setMeasurements(20, 65, 1013.25f);
        weatherData.setMeasurements(22, 70, 1010.25f);
        weatherData.setMeasurements(18, 90, 1012.25f);
    }
}
