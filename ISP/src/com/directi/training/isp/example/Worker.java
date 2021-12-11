package com.directi.training.isp.example;

// this is a general-purpose interface that contains the union of all the needs of every type of a worker (say here a human and a robot)
public interface Worker
{
	// Both a human and a robot work
    String work();

    // Only a human eat
    String eat();
}
