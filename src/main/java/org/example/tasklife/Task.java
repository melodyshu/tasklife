package org.example.tasklife;

@FunctionalInterface
public interface Task<T> {
    T call();
}
