package com.directi.training.dip.exercise_refactored;

//By applying the DIP, MyDatabaseWriter is now depending on abstractions ( IWriter)
public class MyDatabaseWriter implements IWriter
{
    
    public void write(String input)
    {
        MyDatabase database = new MyDatabase();
        database.write(input);
    }
}
