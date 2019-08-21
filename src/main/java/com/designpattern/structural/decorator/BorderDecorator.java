package com.designpattern.structural.decorator;

public class BorderDecorator extends DecoratorWidget {
    public BorderDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("-> Added border.");
    }
}
