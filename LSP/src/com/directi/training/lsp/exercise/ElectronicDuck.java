package com.directi.training.lsp.exercise;

public class ElectronicDuck extends Duck
{
    private boolean _on = false;

    @Override
    public void quack() // An electronic duck is a duck 
    {
        if (_on) { 
        	// since a duck is not supposed to throw an exception when called to quack
            System.out.println("Electronic duck quack...");
        } else {
        	// this is an unexpected behavior of a duck that is supposed to be alaways capable of swimming
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
        	// same for swimming
        	// a duck is always supposed to be capable of swimming 
            System.out.println("Electronic duck swim");
        } else {
        	// so throwing an exception when the electronic duck is off is a weird behavior of a duck 
            throw new RuntimeException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
