package com.designpattern.observable;

/**
 * Created by truong on 12/06/2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
}
