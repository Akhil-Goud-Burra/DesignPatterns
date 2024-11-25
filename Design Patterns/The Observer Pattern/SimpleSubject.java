import java.util.ArrayList;

import Code.Subscribers.Observer;

public class SimpleSubject implements Subject {

    private ArrayList<Observer> observers;
    
    private int value = 0;

    public SimpleSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o); // Add observer to the list
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o); // Remove observer from the list
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value); // Notify each observer with the updated value
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(); // Notify all observers whenever value changes
    }
}
