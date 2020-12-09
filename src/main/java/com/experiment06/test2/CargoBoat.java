package com.experiment06.test2;

import com.experiment06.test2.DangerException;

class CargoBoat {
    int realContent;  //装载的重量
    int maxContent;   //最大装载量
    public void setMaxContent(int c) {
        maxContent = c;
    }
    public void loading(int m) throws DangerException {
        realContent+=m;
        if(realContent>maxContent)throw new DangerException();
        System.out.printf("目前装载了%d吨货物\n",realContent);
    }
}