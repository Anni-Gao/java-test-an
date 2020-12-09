package com.experiment03.e7175;

class BasicEmployee extends Employer{
    BasicEmployee(String name,String department,double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    void showSalary() {
        super.showSalary();

    }
    void showBonus() {
        System.out.println("我是普通员工，没有奖金，加油升级！");
    }
}
