package patterns.observer.subject;

import java.util.ArrayList;

import patterns.observer.observer.Observer;
import patterns.observer.data.Measurement;

public class WeatherData implements Subject {

    private ArrayList<Observer> list;
    private Measurement measurement;

    public WeatherData () {
        list = new ArrayList<Observer>();
        measurement = new Measurement();
    }

    public void addObserver (Observer o) {

        int index = list.indexOf(o);

        if (index < 0) {

            list.add(o);
        }

    }

    public void deleteObserver (Observer o) {

        int index = list.indexOf(o);

        if (index >= 0) {

            list.remove(index);
        }
    }

    public void notifyObservers () {

        for (Observer observer : list) {

            observer.update(measurement);
        }
    }

    public void setMeasurement (Measurement measurement) {
        this.measurement = measurement;
        notifyObservers();
    }
}
