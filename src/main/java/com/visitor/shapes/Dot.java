package com.visitor.shapes;

import com.visitor.visitor.Visitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dot implements Shape{
    private int id;
    private int x;
    private int y;

    @Override
    public void move(int x, int y) {
        System.out.println("Moving to x: " + x + " and y: " + y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing dot");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }
}
