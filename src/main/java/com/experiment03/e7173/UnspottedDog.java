package com.experiment03.e7173;

class UnspottedDog extends Dog{
    UnspottedDog(String kind,int weight,String color){

        if(kind.equals("泰迪"))
            kind=kind+"犬";
        this.kind=kind;
        this.weight=weight;
        this.color=color;
    }
    void show() {
        System.out.print("这是一只"+kind);
    }
}
