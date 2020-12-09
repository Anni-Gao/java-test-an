package com.experiment07.test1;

public class Animal extends Thread {

    private int distance = 30;//设置长度为50m
    //设置兔子和乌龟每次走的路长度
    int rabbitNum = 10;
    int turtleNum = 1;
    //设置兔子和乌龟已经走的路长度
    int rabbitDistance = 0;
    int turtleDistance = 0;

    boolean exit = true;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (exit) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (name.equals("兔子")) {
                rabbitDistance = rabbitDistance + rabbitNum;
                if (rabbitDistance < distance) {
                    System.out.println(name + "距离终点" + (distance - rabbitDistance) + "米" );
                    if (rabbitDistance > turtleDistance){
                        //兔子中间休息
                        System.out.println("兔子领先");
                        System.out.println("我跑得快，睡一觉");
                        try {
                            //兔子休息
                            int r = (int) (Math.random() * 1000);
                            sleep(r);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (rabbitDistance == distance) {
                    System.out.println("======兔子跑完了======");
                    exit = false;
                    break;
                }
            }
            //乌龟不休息
            if (name.equals("乌龟")) {
                turtleDistance = turtleDistance + turtleNum;
                if (turtleDistance < distance) {
                    System.out.println(name + "距离终点" + (distance - turtleDistance) + "米" + " ");
                    if (rabbitDistance > turtleDistance){
                        System.out.println("乌龟领先");
                    }
                }
                if (turtleDistance == distance) {
                    System.out.println("======乌龟跑完了======");
                    exit = false;
                    break;
                }
            }

        }
    }
}