package com.designpattern.behavior.visitor.visitors;

import com.designpattern.behavior.visitor.*;

/**
 * Created by truong on 12/06/2017.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("display Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("display mouse");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("display keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("display monitor");
    }
}
