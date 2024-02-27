package com.visitor.visitor;

import com.visitor.shapes.Circle;
import com.visitor.shapes.Dot;
import com.visitor.shapes.Rectangle;
import com.visitor.shapes.Shape;

public class XMLExportVisitor implements Visitor{

    public String export(Shape... shapes) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("\n<shapes>");
        for (Shape shape : shapes) {
            sb.append(shape.accept(this)).append("\n");
        }
        sb.append("</shapes>");
        return sb.toString();
    }

    @Override
    public String visitDot(Dot dot) {
        return "<dot>" + "\n" +
                "    <id>" + dot.getId() + "</id>" + "\n" +
                "    <x>" + dot.getX() + "</x>" + "\n" +
                "    <y>" + dot.getY() + "</y>" + "\n" +
                "</dot>";
    }

    @Override
    public String visitCircle(Circle circle) {
        return "<circle>" + "\n" +
                "    <id>" + circle.getId() + "</id>" + "\n" +
                "    <x>" + circle.getX() + "</x>" + "\n" +
                "    <y>" + circle.getY() + "</y>" + "\n" +
                "    <radius>" + circle.getRadius() + "</radius>" + "\n" +
                "</circle>";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "<rectangle>" + "\n" +
        "    <id>" + rectangle.getId() + "</id>" + "\n" +
        "    <x>" + rectangle.getX() + "</x>" + "\n" +
        "    <y>" + rectangle.getY() + "</y>" + "\n" +
        "    <width>" + rectangle.getWidth() + "</width>" + "\n" +
        "    <height>" + rectangle.getHeight() + "</height>" + "\n" +
        "</rectangle>";
    }
    
}
