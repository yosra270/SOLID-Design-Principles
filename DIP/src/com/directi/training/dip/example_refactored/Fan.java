package com.directi.training.dip.example_refactored;

// Fan class depend on abstraction (the Equipment interface)
public class Fan implements Equipment
{
    private int _speed;

    
    public void turnOn()
    {
        System.out.println("Fan turned on");
    }

    
    public void turnOff()
    {
        System.out.println("Fan turned off");
    }

    public int getSpeed()
    {
        return _speed;
    }

    public void setSpeed(int speed)
    {
        _speed = speed;
    }
}
