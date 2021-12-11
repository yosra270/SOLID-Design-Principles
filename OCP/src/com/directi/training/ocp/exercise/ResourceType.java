package com.directi.training.ocp.exercise;

/**
 * For now, the resource types supported by this application is time slot and space slot
 * If the project gets bigger and we wanted to add new resource types
 * we will have to break the code of ResourceType
 * which might result in potential bugs breaking the application
 */
public enum ResourceType
{
    TIME_SLOT,
    SPACE_SLOT
}
