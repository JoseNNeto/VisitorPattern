package com.visitor.shapes;

import com.visitor.visitor.Visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle implements Shape{
    private int id;
    private int x;
    private int y;
    private int width;
    private int height;

    @Override
    public void move(int x, int y) {
        System.out.println("Moving to x: " + x + " and y: " + y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }
    
}
