package com.experiment03.e7173;

class SpottedDog extends Dog{
    String spotColor;
    SpottedDog(String kind,int weight,String color,String spotColor){
        if(kind.equals("泰迪"))
            kind=kind+"犬";
        this.kind=kind;
        this.weight=weight;
        this.color=color;
        this.spotColor=spotColor;
    }
    void show() {
        System.out.println("这是一只"+kind+"体重为"+weight+",颜色为"+color);
        System.out.println("这是一只"+kind+",颜色为"+color+",斑点颜色为"+spotColor);
    }
}
