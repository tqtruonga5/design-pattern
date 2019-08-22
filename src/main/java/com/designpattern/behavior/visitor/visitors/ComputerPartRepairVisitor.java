package com.designpattern.behavior.visitor.visitors;

import com.designpattern.behavior.visitor.*;

/**
 * Created by truong on 12/06/2017.
 */
public class ComputerPartRepairVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
    }

    @Override
    public void visit(Mouse mouse) {

    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("Fixed " + keyBoard.getClass().getName());
    }

    @Override
    public void visit(Monitor monitor) {
    }
}
