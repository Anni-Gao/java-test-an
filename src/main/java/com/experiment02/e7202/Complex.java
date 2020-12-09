package com.experiment02.e7202;

class Complex{
    private int a,b;
    public Complex(int a,int b){
        this.a = a;
        this.b = b;
    }
    public Complex(Complex complex){
        this.a = complex.a;
        this.b = complex.b;
    }
    public Complex Add(Complex tmp){
        Complex c = new Complex(tmp.a + this.a, tmp.b + this.b);
        return c;
    }
    public Complex Sub(Complex tmp){
        Complex c = new Complex(this.a - tmp.a, this.b - tmp.b);
        return c;
    }
    public void Print(){
        if(a==0&&b==0){
            System.out.println("0");
        }
        else{
            System.out.println(a + "+" + b + "i");
        }
    }

}