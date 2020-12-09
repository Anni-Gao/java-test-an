package com.experiment03.e7175;

abstract class Employer{
    String name;
    String department;
    double salary;
    void showSalary() {
        System.out.println("我叫"+name+",在"+department+"部门"+"，我的工资是"+salary);
    }
    abstract void showBonus();
}
