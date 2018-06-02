package com.annn;

public class B {
    public void answer(Callback callback,String question) throws InterruptedException {
        System.out.println(question);
        Thread.sleep(5000);
        callback.callback("6666666");
    }
}
