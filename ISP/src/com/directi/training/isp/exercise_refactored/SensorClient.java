package com.directi.training.isp.exercise_refactored;

// SensorClient is a client-specific interface that provides the functionality of opening the door when sensing a near person
public interface SensorClient
{
    void proximityCallback();
}
