package com.directi.training.lsp.example_refactored;

// even though a very natural mathematical logic would state that a square is a particular form of a rectangle where width = height
// we decided that it would more logical in terms of software entities to admit that a square wouldn't be a subclass of the rectangle
// so that we can fix the issue of having to update both height and width whenever we have to update one of them
// therefore respecting the LSP
public class Square
{
    private int _side;

    public int getSide()
    {
        return _side;
    }

    public void setSide(int side)
    {
        _side = side;
    }

    public int getArea()
    {
        return _side * _side;
    }
}
