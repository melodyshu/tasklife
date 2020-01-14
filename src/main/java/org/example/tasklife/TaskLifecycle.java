package org.example.tasklife;

public interface TaskLifecycle<T> {
    void onStart(Thread thread);

    void onRunning(Thread thread);

    void onFinish(Thread thread,T result);

    void OnError(Thread thread,Exception e);
}
