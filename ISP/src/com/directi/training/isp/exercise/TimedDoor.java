package com.directi.training.isp.exercise;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TimedDoor implements Door
{
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
    }

 // We can lock, unlock, close and open a timed door
    
    public void lock()
    {
        _locked = true;
    }

    
    public void unlock()
    {
        _locked = false;
    }

    
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    
    public void close()
    {
        _opened = false;
    }


    // furthermore, we can lock a timed door after a certain timeout
    public void timeOutCallback()
    {
        _locked = true;
    }

    // But a timed door can't sense the presence of a near person and opens
    // Nevertheless, TimedDoor is obliged to implement a method it does not need since it implements the general-purpose interface Door
    public void proximityCallback()
    {
        throw new NotImplementedException();
    }
}
