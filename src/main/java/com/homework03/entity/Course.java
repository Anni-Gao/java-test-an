package com.homework03.entity;
public class Course {
    private int number;
    private String name;
    private boolean compulsory;
    public Course(int number, String name, boolean compulsory) {
        this.number = number;
        this.name = name;
        this.compulsory = compulsory;
    }

    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public boolean isCompulsory(){
        return compulsory;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCompulsory(boolean compulsory){
        this.compulsory = compulsory;
    }
}


