package com.directi.training.isp.exercise_refactored;

// Since SensingDoor is now implementing only client-specific interfaces, 
//it won't have to provide implementation for method it does need (timeOutCallback() or TimerClient interface)
public class SensingDoor implements Door, SensorClient
{
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);
    }

    
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

    
    public void proximityCallback()
    {
        _opened = true;
    }
}
