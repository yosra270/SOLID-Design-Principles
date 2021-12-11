package com.directi.training.lsp.exercise_refactored;

// a duck implements IDuck interface in which quack and swim might throw an ecpetion
public class Duck implements IDuck
{
    
    public void quack()
    {
        System.out.println("Quack.....");
    }

    
    public void swim()
    {
        System.out.println("Swim....");
    }

}
