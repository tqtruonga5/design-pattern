package com.designpattern.behavior.visitor;

/**
 * Created by truong on 12/06/2017.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
