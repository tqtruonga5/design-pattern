package com.designpattern.observable;

/**
 * Created by truong on 12/06/2017.
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Binary string:" + Integer.toBinaryString(subject.state));
    }
}
