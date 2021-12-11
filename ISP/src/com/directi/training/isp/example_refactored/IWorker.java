package com.directi.training.isp.example_refactored;


//We segregated the general-purpose interface to more client-specific interfaces 
//IWorker is the interface responsible of providing the working method
public interface IWorker
{
    String work();
}
