package patterns.observer.subject;

import patterns.observer.observer.Observer;

public interface Subject {

    public void addObserver (Observer observer);
    public void deleteObserver (Observer observer);
    public void notifyObservers();
}
