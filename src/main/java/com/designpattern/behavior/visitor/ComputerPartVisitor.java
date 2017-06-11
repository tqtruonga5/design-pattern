package com.designpattern.behavior.visitor;

/**
 * Created by truong on 12/06/2017.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(KeyBoard keyBoard);

    void visit(Monitor monitor);
}
