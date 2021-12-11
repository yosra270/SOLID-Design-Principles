package com.directi.training.isp.exercise_refactored;

// Door interface turned into a client-specific interface that provides the very basic functionalities of any door
// which are locking, unlocking, opening and closing
public interface Door
{
    void lock();

    void unlock();

    void open();

    void close();
}
