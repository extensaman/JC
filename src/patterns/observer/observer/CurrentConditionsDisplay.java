package patterns.observer.observer;

import patterns.observer.data.Measurement;
import patterns.observer.subject.Subject;

public class CurrentConditionsDisplay implements Observer {
    Subject subject;
    private Measurement measurement;

    public CurrentConditionsDisplay (Subject subject) {

        if (subject != null) {
            subject.addObserver(this);
            this.subject = subject;
        }
    }

    public void update (Object measurement) {

        if (measurement != null) {
            this.measurement = (Measurement) measurement;
            display();
        }
    }

    public void display() {

        System.out.println("\nDisplay current conditions:" + measurement);
    }
}
