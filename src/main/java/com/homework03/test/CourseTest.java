package com.homework03.test;
import com.homework03.entity.Course;
public class CourseTest {
    public static void main(String[] args){
        testNewStudent();
    }
    private static void testNewStudent(){
        Course course = new Course(2018001,"Java程序设计",true);
        System.out.println(course.getName());
        System.out.println(course.getNumber());
        System.out.println(course.isCompulsory());
        course.setName("Web开发技术");
        course.setCompulsory(false);
        System.out.println(course.getName());
        System.out.println(course.getNumber());
        System.out.println(course.isCompulsory());
    }
}
