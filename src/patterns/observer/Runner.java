package patterns.observer;

import patterns.observer.data.Measurement;
import patterns.observer.observer.CurrentConditionsDisplay;
import patterns.observer.observer.StatisticsDiplay;
import patterns.observer.subject.WeatherData;

public class Runner {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        StatisticsDiplay sd = new StatisticsDiplay(weatherData);

        weatherData.setMeasurement(new Measurement(25, 755, 92));
        weatherData.setMeasurement(new Measurement(27, 758, 91));
    }
}
