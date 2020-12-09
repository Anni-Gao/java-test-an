package com.experiment03.e7176;

class English implements Teach{
    String s;
    English(String s){
        this.s=s;
    }
    public void teaching() {
        System.out.println("我是英语老师，I say "+s);
    }
}
