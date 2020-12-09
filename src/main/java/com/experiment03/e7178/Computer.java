package com.experiment03.e7178;

class Computer{
    Usb usb[]=new Usb[100];
    int cnt=0;
    void addUsb(Usb tmp) {
        if(cnt<100)
            usb[++cnt]=tmp;
    }
    void powerOn() {
        for(int i=0;i<=cnt;i++) {
            if(usb[i]!=null) {
                System.out.println("计算机开机成功");
                break;
            }
        }
    }
    void powerOff() {
        for(int i=0;i<=cnt;i++) {
            if(usb[i]!=null)
                usb[i].turnOff();
        }
        System.out.println("计算机关机成功");
    }

}
