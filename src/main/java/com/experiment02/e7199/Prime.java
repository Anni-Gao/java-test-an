package com.experiment02.e7199;

class Prime{
    // Write your own code
    Boolean Prime(int x){
        if(x==1){
            return false;
        }
        for(int i=2; i<x; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}