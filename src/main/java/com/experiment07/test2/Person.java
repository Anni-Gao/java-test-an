package com.experiment07.test2;

class Person implements Runnable {
    Object lock = new Object();//定义任意一个对象，用作同步代码块的锁的

    public void run() {
        synchronized (lock) {//定义同步代码块
            System.out.println(Thread.currentThread().getName() + " 通过山洞");
            try {
                Thread.sleep(5000);//通过时间5s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}