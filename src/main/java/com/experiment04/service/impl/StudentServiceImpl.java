package com.experiment04.service.impl;

import com.experiment04.entity.Student;
import com.experiment04.service.StudentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {

    public List<Student> students = new ArrayList<Student>();

    @Override
    public List<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        List<Student> studentsYear = new ArrayList<>();
        students.forEach(s->{
            if(s.getYear()==year) {
                studentsYear.add(s);
            }
        });
        return studentsYear;
    }

    @Override
    public List<String> listStudentsNames(int year, Student.Sex sex) {
        List <String> studentsName = new ArrayList<>();
        students.forEach(s->{
            if(s.getYear()==year && s.getSex()==sex) {
                studentsName.add(s.getName());
            }
        });
        return studentsName;
    }

    @Override
    public Map<Student.Sex, List<Student>> mapStudentsBySex() {
        Map<Student.Sex, List<Student>> map = new HashMap<>();
        map.put(Student.Sex.MALE, new ArrayList<Student>());
        map.put(Student.Sex.FEMALE, new ArrayList<Student>());
        students.forEach(s -> {
            if (s.getSex() == Student.Sex.MALE) {
                map.get(Student.Sex.MALE).add(s);
            }
            if (s.getSex() == Student.Sex.FEMALE) {
                map.get(Student.Sex.FEMALE).add(s);
            }
        });
        return map;
    }

    @Override
    public boolean removeStudent(int id) {
        return students.removeIf(s->{
            if(s.getId()==id) {
                return true;
            }
            return false;
         });
    }
}
