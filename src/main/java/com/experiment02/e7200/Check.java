package com.experiment02.e7200;

class Check {
    //write your code here
    public int Check(int a,int b){
        return a>b?a:b;
    }
    public double Check(double a, double b, double c){
        return a*b*c;
    }
    public Boolean Check(String a, String b){
        return a.contentEquals(b);
    }
}