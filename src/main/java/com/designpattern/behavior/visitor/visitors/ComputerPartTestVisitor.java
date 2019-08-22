package com.designpattern.behavior.visitor.visitors;

import com.designpattern.behavior.visitor.*;

/**
 * Created by truong on 12/06/2017.
 */
public class ComputerPartTestVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Testing Computer -> OK");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Testing mouse -> OK");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("Testing keyboard -> NG");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Testing monitor -> OK");
    }
}
