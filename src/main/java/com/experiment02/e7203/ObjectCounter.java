package com.experiment02.e7203;

class ObjectCounter {

    //write your code here
    private static int count = 0;
    ObjectCounter(){
        count++;
    }
    static int getCount(){
        return count;
    }

}
