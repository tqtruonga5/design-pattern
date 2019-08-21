package com.designpattern.structural.decorator;

public class ScrollDecorator extends DecoratorWidget {
    public ScrollDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("-> Added scroll bar");
    }
}
