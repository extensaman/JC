package patterns.observer.observer;

import patterns.observer.data.Measurement;
import patterns.observer.data.Statistics;
import patterns.observer.subject.Subject;

public class StatisticsDiplay implements Observer {

    Subject subject;
    Statistics statistics;

    public StatisticsDiplay (Subject subject) {
        subject.addObserver(this);
        this.subject = subject;
        statistics = new Statistics();
    }

    @Override
    public void update(Object obj) {
        statistics.putMeasurement((Measurement) obj);
        display ();
    }

    public void display() {

        System.out.println("\nStatistics:" + statistics);
    }
}
