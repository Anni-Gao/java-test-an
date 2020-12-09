package com.homework06;

public class Test {
    public static void main(String[] args) {
        getButtonA();
        getButtonB();
    }
    private static void getButtonA(){
        Button buttonA = new Button();
        buttonA.setOnClickable(new OnClickable() {
            @Override
            public void onClick() {
                System.out.println("ButtonA");
            }
        });
    }
    private static void getButtonB(){
        Button buttonB = new Button();
        buttonB.setOnClickable(new OnClickable() {
            @Override
            public void onClick() {
                System.out.println("ButtonB");
            }
        });
    }
}
