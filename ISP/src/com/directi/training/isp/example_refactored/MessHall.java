package com.directi.training.isp.example_refactored;

import java.util.List;

public class MessHall
{
	// since we need only the eat method of the eating workers, we will use IEater as a type of the workers who eat
    private List<IEater> _eaters;

    public MessHall(List<IEater> eaters)
    {
        _eaters = eaters;
    }

    public void manage()
    {
        for (IEater eater : _eaters) {
            eater.eat();
        }
    }
}
