package com.directi.training.isp.exercise;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SensingDoor implements Door
{
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
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

    // Furthermore, a sensing door can sense the presence a near person and opens
    public void proximityCallback()
    {
        _opened = true;
    }
    
    //But, we cannot lock a sensing door after a certain timeout
    // Nevertheless, SensingDoor class is obliged to provide an implementation to a method it does not need since it implements the general-purpose interface Door
    public void timeOutCallback()
    {
        throw new NotImplementedException();
    }


}
