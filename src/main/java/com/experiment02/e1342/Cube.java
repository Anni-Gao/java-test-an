package com.experiment02.e1342;

class Cube{
    private  int length;
    private  int width;
    private  int height;
    public Cube(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public int volumeCube(){
        return length*width*height;
    }
    public int squareCube(){
        return (length*width + length*height + width*height)*2;
    }
}