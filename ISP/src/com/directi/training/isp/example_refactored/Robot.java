package com.directi.training.isp.example_refactored;

public class Robot implements IWorker
{
    // Robot does not have to implement the eat method that it does not need anymore
	// Only the methods it needs will be implemented say the work method
    public String work()
    {
        return "Robot works";
    }
}
