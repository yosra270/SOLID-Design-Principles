package com.directi.training.lsp.exercise_refactored;

// to fix of having an electronic duck that does not swim and quack all the time as a duck does
// electronic duck is not a subclass of the duck class anymore
// instead both classes implement the interface IDuck which contract takes into account that swimming or quacking might throw an exception
// in other words this interface allow classes that implements it to be capable of swimming and quacking or not
public class ElectronicDuck implements IDuck
{
    private boolean _on = false;

    // since quack method in IDuck throws an exception, electronic duck does change the behavior expected from an IDuck
    // therefore, it is expected from now on that an IDuck might not be capable of quacking
    public void quack() throws DuckIsOffException
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new DuckIsOffException("Can't quack when off");
        }
    }

   // same for swimming which became an expected behavior of an IDuck that can swim or not
    public void swim() throws DuckIsOffException
    {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            throw new DuckIsOffException("Cant swim when off");
        }
    }

    public void turnOn()
    {
        this._on = true;
    }

    public void turnOff()
    {
        this._on = false;
    }


    public static class DuckIsOffException extends IDuckException
    {
        public DuckIsOffException(String message)
        {
            super(message);
        }
    }

}
