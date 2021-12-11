package com.directi.training.isp.exercise_refactored;

//TimerClient is a client-specific interface that provides the functionality of locking the door after a certain timeout
public interface TimerClient
{
    void timeOutCallback();
}
