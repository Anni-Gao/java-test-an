package com.experiment04;
import com.experiment04.entity.Student;
import com.experiment04.service.StudentService;
import com.experiment04.service.impl.StudentServiceImpl;


public class Test {

    public static void main(String[] args) {
        StudentService studentService=new StudentServiceImpl();

        //1.加入
        System.out.println("----------------1.向集合添加一个学生，返回当前全部学生----------------");
        studentService.addStudent(new Student(201001, Student.Sex.FEMALE, "赵阳阳", 2010));
        studentService.addStudent(new Student(201002, Student.Sex.MALE, "邵鹏", 2010));
        studentService.addStudent(new Student(201103, Student.Sex.MALE, "高学斌", 2011));
        studentService.addStudent(new Student(201104, Student.Sex.MALE, "张扬", 2011));
        studentService.addStudent(new Student(201205, Student.Sex.FEMALE, "吕惠玲", 2012));
        studentService.addStudent(new Student(201206, Student.Sex.MALE, "曾志优", 2012));

        StudentServiceImpl studentServiceShow= (StudentServiceImpl) studentService;
        studentServiceShow.students.forEach(s->
                System.out.println(s.getId() + " " + s.getName() + " " + s.getYear() + " " + s.getSex() )
        );
        //2.返回指定届的全部学生
        System.out.println("----------------2.返回指定届的全部学生----------------");
        studentService.listStudentsByYear(2010).forEach(s->
                System.out.println(s.getId()+" " +s.getName()+" " +s.getYear()+" " +s.getSex() )
        );
        //3.返回指定届，指定性别的全部学生的姓名
        System.out.println("----------------3.返回指定届，指定性别的全部学生的姓名----------------");
        studentService.listStudentsNames(2011, Student.Sex.MALE).forEach(s->
                System.out.println(s)
        );
        //4.将所有学生，以性别分组
        System.out.println("----------------4.将所有学生，以性别分组----------------");
        studentService.mapStudentsBySex().get(Student.Sex.MALE).forEach(s->
                System.out.println(s.getId() + " " + s.getName() + " " + s.getYear() + " " + s.getSex() )
        );
        System.out.println();
        studentService.mapStudentsBySex().get(Student.Sex.FEMALE).forEach(s->
                System.out.println(s.getId() + " " + s.getName() + " " + s.getYear() + " " + s.getSex() )
        );
        //5.删除指定学号的学生，返回是否成功删除
        System.out.println("----------------5.删除指定学号的学生，返回是否成功删除----------------");

        System.out.println(studentService.removeStudent(201001));
        ((StudentServiceImpl) studentService).students.forEach(s->
                System.out.println(s.getId() + " " + s.getName() + " " + s.getYear() + " " + s.getSex() )
        );

    }
}
