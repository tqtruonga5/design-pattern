package com.designpattern.behavior.visitor;

/**
 * Created by truong on 12/06/2017.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
