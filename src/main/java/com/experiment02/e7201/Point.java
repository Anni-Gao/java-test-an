package com.experiment02.e7201;

class Point {

    private  int x;
    private  int y;

    public Point(int xx,int yy)	//构造方法
    {
        this.x=xx;
        this.y=yy;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    //write your code
    public static void fun1(Point p)
    {
        System.out.println(p.getX());
    }

    public static Point fun2()
    {
        Point A =new Point(1,2);
        return A;
    }

}
