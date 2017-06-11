package com.designpattern.observable;

/**
 * Created by truong on 12/06/2017.
 */
public class HexaObserver extends Observer {
    @Override
    public void update() {
        System.out.println("Hexa string:" + Integer.toHexString(this.subject.state));
    }

    public HexaObserver(Subject subject) {
        super(subject);
    }
}
