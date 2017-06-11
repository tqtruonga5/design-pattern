package com.designpattern.behavior.visitor;

import java.util.Arrays;
import java.util.List;

/**
 * Created by truong on 12/06/2017.
 */
public class Computer implements ComputerPart {
    List<ComputerPart> parts;

    public Computer() {
        this.parts = Arrays.asList(new Monitor(), new Mouse(), new KeyBoard());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        this.parts.forEach(part -> part.accept(computerPartVisitor));
        computerPartVisitor.visit(this);
    }
}
