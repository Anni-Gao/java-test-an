package com.homework09;

public class Course {
    private String name;
    private boolean elective;
    private Teacher teacher;

    // getter/setter
    public String getName(){
        return name;
    }
    public boolean isElective(){
        return elective;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setElective(boolean elective) {this.elective = elective; }
    public void setTeacher(Teacher teacher) {this.teacher = teacher; }
}