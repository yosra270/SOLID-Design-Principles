package com.directi.training.isp.example_refactored;

import java.util.List;

public class FloorManager
{
	// since we need only the work method of the workers, we will use IWorker as a type of the workers
    private List<IWorker> _workers;

    public FloorManager(List<IWorker> workers)
    {
        _workers = workers;
    }

    public void manage()
    {
        for (IWorker worker : _workers) {
            worker.work();
        }
    }
}
