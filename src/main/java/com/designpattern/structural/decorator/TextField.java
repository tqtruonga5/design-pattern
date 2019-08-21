package com.designpattern.structural.decorator;

public class TextField implements Widget {

    private int width;
    private int height;

    public TextField(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public void draw() {
        System.out.println(String.format("-> Text field with width : %d, height: %d", width, height));
    }
}
