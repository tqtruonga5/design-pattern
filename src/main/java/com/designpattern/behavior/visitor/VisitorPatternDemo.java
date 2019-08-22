package com.designpattern.behavior.visitor;

import com.designpattern.behavior.visitor.visitors.ComputerPartDisplayVisitor;
import com.designpattern.behavior.visitor.visitors.ComputerPartRepairVisitor;
import com.designpattern.behavior.visitor.visitors.ComputerPartTestVisitor;

/**
 * Created by truong on 12/06/2017.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartTestVisitor());
        System.out.println(" ============= ");
        computerPart.accept(new ComputerPartRepairVisitor());
        System.out.println(" ============= ");
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
