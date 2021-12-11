package com.directi.training.isp.example_refactored;

// We segregated the general-purpose interface to more client-specific interfaces 
// IEater is the interface responsible of providing the eating method
public interface IEater
{
    String eat();
}
