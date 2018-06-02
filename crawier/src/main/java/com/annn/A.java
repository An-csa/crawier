package com.annn;

public class A implements Callback {
    @Override
    public void callback(String result) {
        System.out.println(result);
    }

    private B b;

    public A(B b) {
        this.b = b;
    }
    public void ask(){
        new Thread(() -> {
            try {
                b.answer(new C(), "11111");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("wait");
    }
}
