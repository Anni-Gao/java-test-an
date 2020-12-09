package design_patten.Bulider;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private List<String> parts = new ArrayList<String>();

    public void Add(String part){
        parts.add(part);
    }

    public void Show(){
        for (int i = 0; i < parts.size(); i++){
            System.out.println("组件"+parts.get(i)+"装好了");
        }
        System.out.println("手机组装完成");
        System.out.println();
    }
}
