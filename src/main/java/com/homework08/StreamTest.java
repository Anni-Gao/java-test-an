package com.homework08;
import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {
    private static final List<Student> STUDENTS = create();
    private static final String CLAZZ1 = "软件1班";
    private static final String CLAZZ2 = "软件2班";

    private static List<Student> create() {
        Student s1 = new Student(2018008, "张扬", CLAZZ2, 66);
        Student s2 = new Student(2018005, "刘飞", CLAZZ1, 92);
        Student s3 = new Student(2018007, "李明", CLAZZ2, 42);
        Student s4 = new Student(2018006, "赵勇", CLAZZ2, 56);
        Student s5 = new Student(2018002, "王磊", CLAZZ1, 81);
        Student s6 = new Student(2018010, "牛娜", CLAZZ1, 78);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        return students;
    }
    public static void main(String[] args) {
        // 调用实现方法测试
        filter(90)
                .forEach(s -> System.out.println(s.getName() + " " + s.getScore()));
        System.out.println();

        filter1(CLAZZ1,90)
                .forEach(s -> System.out.println(s.getName() + " " + s.getScore()));
        System.out.println();

        filter2(CLAZZ2,90)
                .forEach(s -> System.out.println(s));
        System.out.println();

        sorted1()
                .forEach(s -> System.out.println(s.getName() + " " + s.getScore()));
        System.out.println();

        sorted2(CLAZZ2,90)
                .forEach(s -> System.out.println(s.getName() + " " + s.getScore()));
        System.out.println();

        sorted3(CLAZZ2,90)
                .forEach(s -> System.out.println(s));
        System.out.println();

        collectGroupingBy(CLAZZ2,90)
                .forEach((k, v) -> System.out.println(k + " " + v));



    }
    //获取成绩小于等于指定分数，的全部学生
    private static List<Student> filter(int score) {
        return STUDENTS.stream()
                .filter(s -> s.getScore() <= score)
                .collect(Collectors.toList());
    }
    //获取指定班级，成绩小于等于指定分数，的全部学生
    private static List<Student> filter1(String clazz, int score) {
        return STUDENTS.stream()
                .filter(s -> clazz.equals(s.getClazz())&& s.getScore() <= score)
                .collect(Collectors.toList());
    }
    //获取指定班级，成绩小于等于指定分数，的全部学生的姓名
    private static List<String> filter2(String clazz, int score) {
        return STUDENTS.stream()
                .filter(s -> clazz.equals(s.getClazz())&& s.getScore() <= score)
                .map(Student::getName)
                .collect(Collectors.toList());
    }
    //按成绩由低到高排序，返回全部学生
    private static List<Student> sorted1() {
        return STUDENTS.stream()
                .sorted(Comparator.comparing(Student::getScore))
                .collect(Collectors.toList());
    }
    //获取指定班级，成绩小于等于指定分数，成绩由高到低排序，的全部学生
    private static List<Student> sorted2(String clazz, int score) {
        return STUDENTS.stream()
                .filter(s -> clazz.equals(s.getClazz())&& s.getScore() <= score)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .collect(Collectors.toList());
    }
    //获取指定班级，成绩小于等于指定分数，成绩由高到低排序，的全部学生的学号。注意返回类型
    private static List<Integer> sorted3(String clazz, int score) {
        return STUDENTS.stream()
                .filter(s -> clazz.equals(s.getClazz())&& s.getScore() <= score)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .map(Student::getNumber)
                .collect(Collectors.toList());
    }
    //获取指定班级，成绩小于等于指定分数，的全部学生，成绩由高到低排序
    //以学生学号为键，学生分数为值，Map分组，返回
    private static Map<Integer, Integer> collectGroupingBy(String clazz, int score) {
        Map<Integer, Integer> group =  STUDENTS.stream()
                .filter(s -> clazz.equals(s.getClazz())&& s.getScore() <= score)
                .collect(Collectors.toMap(Student::getNumber,Student::getScore));
        group.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        return group;

    }



}
