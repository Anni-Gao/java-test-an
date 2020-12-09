package com.experiment03.e7175;

class GoodEmployee extends Employer{
    double bonous;
    GoodEmployee(String name,String department,double salary,double bonous){
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.bonous=bonous;
    }
    void showSalary() {
        super.showSalary();

    }
    void showBonus() {
        System.out.println("我是优秀员工，我的奖金是"+bonous);
    }
}
