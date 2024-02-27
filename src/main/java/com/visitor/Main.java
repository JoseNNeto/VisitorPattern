package com.visitor;

import com.visitor.shapes.Circle;
import com.visitor.shapes.Dot;
import com.visitor.shapes.Rectangle;
import com.visitor.shapes.Shape;
import com.visitor.visitor.XMLExportVisitor;

public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        // add Triangle


        dot.draw();
        circle.move(10, 10);
        rectangle.draw();
        
        export(circle, dot, rectangle);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
    
}