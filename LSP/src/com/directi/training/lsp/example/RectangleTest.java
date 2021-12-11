package com.directi.training.lsp.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// bugs resulted from breaking the LSPare hard to detect since this deals with the BEHAVIOR of a subclass.
public class RectangleTest
{
    @Test
    public void testSetWidth_Rectangle()
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        
        // If we have a rectangle of 5 width and 4 height
        // Then when we ask for the width and the area of this rectangle
        // we await a logical behavior that would return respectively 5 and 20, which is the case
        assertEquals(5, rectangle.getWidth());
        assertEquals(20, rectangle.getArea());
    }

    @Test
    public void testSetWidth_Square()
    {
        Rectangle rectangle = new Square();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        
        // According to our implementations, a square is a rectangle
        // since for a rectangle of 5 width and 4 height we've got 5 width and 20 area
        // then we await the exact same behavior from a square that we've set its width and height to respectively 5 and 4
        // but since updating one property of a square updates both width and height
        // then width = height = 4 and area = 4*4 = 16 which is a weird behavior for a rectangle
        assertEquals(5, rectangle.getWidth()); // this test won't pass since width = 4
        assertEquals(20, rectangle.getArea()); // this test won't pass since area = 16
    }
}