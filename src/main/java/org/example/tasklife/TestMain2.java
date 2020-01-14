package org.example.tasklife;

import java.util.concurrent.TimeUnit;

public class TestMain2 {
    public static void main(String[] args) {
        final TaskLifecycle<String> lifecycle=new EmptyLifecycle(){
            @Override
            public void onFinish(Thread thread, Object result) {
                System.out.println("The result is "+result);
            }
        };

        Observable observable=new ObservableThread<String>(lifecycle,()->{
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("finish done.");
            return "hello Observer";
        });

        observable.start();
    }
}
