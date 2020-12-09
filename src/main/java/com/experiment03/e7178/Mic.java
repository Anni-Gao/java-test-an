package com.experiment03.e7178;

class Mic implements Usb{
    Mic(){
        turnOn();
    }
    public void turnOn() {
        System.out.println("麦克启动了");
    }
    public void turnOff() {
        System.out.println("麦克关闭了");
    }
}
