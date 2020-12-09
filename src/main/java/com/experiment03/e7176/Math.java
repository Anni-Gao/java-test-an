package com.experiment03.e7176;

class Math implements Teach{
    String s;
    Math(String s){
        this.s=s;
    }
    public void teaching() {
        System.out.println("我是数学老师，I say "+s);
    }
}
