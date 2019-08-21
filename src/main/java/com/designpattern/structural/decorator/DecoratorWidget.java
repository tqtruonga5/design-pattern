package com.designpattern.structural.decorator;

public class DecoratorWidget implements Widget {
    private Widget baseWidget;
    public DecoratorWidget(Widget widget){
        baseWidget = widget;
    }
    @Override
    public void draw() {
        baseWidget.draw();
    }
}
