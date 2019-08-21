package com.designpattern.structural.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Widget widget = new TextField(100, 300);
        widget = new BorderDecorator(widget);
        widget = new ScrollDecorator(widget);
        widget.draw();
    }
}
