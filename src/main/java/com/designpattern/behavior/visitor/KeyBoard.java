package com.designpattern.behavior.visitor;

/**
 * Created by truong on 12/06/2017.
 */
public class KeyBoard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
