package org.example.tasklife;

import java.util.concurrent.TimeUnit;

public class TestMain {
    public static void main(String[] args) {
        Observable observable=new ObservableThread<>(()->{
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" finish done.");
            return null;
        });
        observable.start();
    }
}
