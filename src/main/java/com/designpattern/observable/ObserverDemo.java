package com.designpattern.observable;

/**
 * Created by truong on 12/06/2017.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("first state is 5");
        subject.state = 5;
        subject.notifyAllObservers();
        System.out.println("next state is 10");
        subject.state = 10;
        subject.notifyAllObservers();

    }
}
