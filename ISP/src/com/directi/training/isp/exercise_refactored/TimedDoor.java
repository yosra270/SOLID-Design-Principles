package com.directi.training.isp.exercise_refactored;

//Since TimedDoor is now implementing only client-specific interfaces, 
//it won't have to provide implementation for method it does need (proximityCallback() or SensorClient interface)
public class TimedDoor implements Door, TimerClient
{
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
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

    
    public void timeOutCallback()
    {
        _locked = true;
    }
}
