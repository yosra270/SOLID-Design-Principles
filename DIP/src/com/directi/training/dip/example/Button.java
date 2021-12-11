package com.directi.training.dip.example;

public class Button
{
	// the Button class depend on a concrete implementation which is the Lamp class 
    private Lamp _lamp; // say we want to add a fan that we want to turn on or off using a button 
    					// => the existing code will be hard to extend
    private boolean _state;

    public Button(Lamp lamp)
    {
        _lamp = lamp;
    }

    public void toggle()
    {
        _state = !_state;
        boolean buttonOn = _state;
        if (buttonOn) {
            _lamp.turnOn();
        } else {
            _lamp.turnOff();
        }
    }

}
