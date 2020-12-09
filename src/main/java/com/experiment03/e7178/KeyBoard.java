package com.experiment03.e7178;

class KeyBoard implements Usb{
    KeyBoard(){
        turnOn();
    }
    public void turnOn() {
        System.out.println("键盘启动了");
    }
    public void turnOff() {
        System.out.println("键盘关闭了");
    }
}
