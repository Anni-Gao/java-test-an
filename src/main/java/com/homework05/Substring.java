package com.homework05;

public class Substring {

    public static void main(String[] args){

        String path = "/courses/lecture/Lecture01.pdf";

        int index1 = path.lastIndexOf(".");

        int index2 = path.lastIndexOf("/");

        System.out.println("扩展名:" + path.substring(index1 + 1));

        System.out.println("文件名:" + path.substring(index2 + 1, index1));

    }



}