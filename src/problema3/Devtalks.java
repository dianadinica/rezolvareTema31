package problema3;

import java.util.ArrayList;
import java.util.List;

public class Devtalks implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(message));
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
