package com.directi.training.lsp.example;

// in mathematics, a square is a particular case of a rectangle where width = height
public class Square extends Rectangle
{
	// since width = height in a square
	// we will try to preserve this property by updating both width and height whenever one of the is changed
	// but this would break the LSP as demonstrated in RectangleTest class
	
    @Override
    public void setWidth(int width)
    {
        _width = width;
        _height = width;
    }

    @Override
    public void setHeight(int height)
    {
        _height = height;
        _width = height;
    }
}
