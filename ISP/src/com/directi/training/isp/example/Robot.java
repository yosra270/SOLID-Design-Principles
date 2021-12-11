package com.directi.training.isp.example;

public class Robot implements Worker
{
    
    public String work()
    {
        return "Robot works";
    }

    // A robot does not eat
    // nevertheless, it still implements a method that it does need
    public String eat()
    {
        throw new RuntimeException("Robot can't eat");
    }
}
