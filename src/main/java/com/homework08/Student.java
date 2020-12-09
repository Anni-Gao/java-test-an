package com.homework08;

public class Student {


    private int number;
    private String name;
    private String clazz;
    private int score;

    public Student(int number, String name, String clazz, int score) {

        this.number = number;
        this.name = name;
        this.clazz = clazz;
        this.score = score;
    }


    public int getNumber() {
        return number;
    }
    public String getName(){
        return name; }
    public String getClazz(){
        return clazz;
    }
    public int getScore() {
        return score;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClazz(String clazz)  {
        this.clazz = clazz;
    }
    public void setScore(int score) {
        this.score = score;
    }
}