package com.designpattern.behavior.visitor;

import java.util.Arrays;
import java.util.List;

/**
 * Created by truong on 12/06/2017.
 */
public class Computer implements ComputerPart {
    private List<ComputerPart> parts;

    Computer() {
        this.parts = Arrays.asList(new Monitor(), new Mouse(), new KeyBoard());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : this.parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
