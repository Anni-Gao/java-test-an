package com.experiment02.e1044;

class Student{
    private String name;
    private int age;
    private int no;
    public Student(String name,int age,int no){
        this.name = name;
        this.age = age;
        this.no = no;
    }
    public int getAge(){
        return age;
    }
    public int getNo(){
        return no;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setNo(int no){
        this.no = no;
    }
    public void setName(String name){
        this.name = name;
    }
}