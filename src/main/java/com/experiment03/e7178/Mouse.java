package com.experiment03.e7178;

class Mouse implements Usb{
    Mouse(){
        turnOn();
    }
    public void turnOn() {
        System.out.println("鼠标启动了");
    }
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}
