package com.directi.training.lsp.exercise_refactored;

// now both quack and swim throw an exception
// that means that any IDuck can or not swim and quack
// so now, both duck and electronic duck can implement this interface without changing its behaviour
public interface IDuck
{
    void quack() throws IDuckException;

    void swim() throws IDuckException;

    class IDuckException extends Exception
    {
        public IDuckException(String message)
        {
            super(message);
        }
    }
}
