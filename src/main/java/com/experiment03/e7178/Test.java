package com.experiment03.e7178;

public class Test{
    public static void main(String argc[]) {
        Mouse m=new Mouse();
        KeyBoard k=new KeyBoard();
        Mic mic=new Mic();
        Computer com=new Computer();
        com.addUsb(m);
        com.addUsb(k);
        com.addUsb(mic);
        com.powerOn();
        com.powerOff();
    }
}

