package com.experiment06.test2;
import com.experiment06.test2.CargoBoat;
import com.experiment06.test2.DangerException;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        CargoBoat ship = new CargoBoat();
        Scanner scan = new Scanner(System.in);
        ship.setMaxContent(1000);
        int m=0;//输入货物数为-1结束装载
        try{
            while(m!=-1) {
                m = scan.nextInt();
                ship.loading(m);
            }
        }
        catch(DangerException e) {
            e.showError();
            System.out.printf("无法再装载重量是%d吨的集装箱\n",m);
        }
        finally {
            System.out.println("货船将正点启航");
        }
    }
}
