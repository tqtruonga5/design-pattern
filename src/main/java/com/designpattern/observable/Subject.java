package com.designpattern.observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by truong on 12/06/2017.
 */
public class Subject {
    List<Observer> observers = new ArrayList<>();
    public int state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update());
    }
}
