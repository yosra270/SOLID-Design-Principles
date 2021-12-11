package com.directi.training.isp.exercise;

// Door is a general-purpose interface that provides locking, unlocking, opening and closing methods
// As well as, locking the door afeter certain timeout and opening the door when sensing a near person
public interface Door
{
    void lock();

    void unlock();

    void open();

    void close();

    void timeOutCallback();

    void proximityCallback();
}
