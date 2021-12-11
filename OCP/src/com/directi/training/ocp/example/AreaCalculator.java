package com.directi.training.ocp.example;

import java.util.List;
/**
 * AreCalculator's job is to calculate the area of given set of shapes 
 * Only shapes of type Circle or Square are supported
 * So if we ever want to expand the project so it can support other types of shapes say triangles, rectangles,...
 * We will have to change the code of the AreaCalculator class
 * Which risks potential bugs breaking the application
 * @author yosra
 *
 */
public class AreaCalculator
{
    public void calculateArea(List<Shape> shapes)
    {
        double area = 0;
        for (Shape shape : shapes) {
            if (shape.getType() == ShapeType.SQUARE) {
                area += calculateSquareArea((Square) shape);
            } else if (shape.getType() == ShapeType.CIRCLE) {
                area += calculateCircleArea((Circle) shape);
            }
        }
        System.out.println("total area = " + area);
    }

    public double calculateSquareArea(Square square)
    {
        return square.getSide() * square.getSide();
    }

    public double calculateCircleArea(Circle circle)
    {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }
}
