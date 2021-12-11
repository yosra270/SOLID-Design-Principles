package com.directi.training.isp.example_refactored;

// A human can work and eat so HUman class will be implementing the two client-specific interfaces IWorker and IEater
public class Human implements IWorker, IEater
{
    
    public String work()
    {
        return "Human works";
    }

    
    public String eat()
    {
        return "Human eats";
    }
}
