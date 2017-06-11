package com.designpattern.observable;

/**
 * Created by truong on 12/06/2017.
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Octal string:" + Integer.toOctalString(subject.state));
    }
}
