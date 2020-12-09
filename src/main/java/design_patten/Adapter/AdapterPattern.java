package design_patten.Adapter;

public class AdapterPattern {
    public static void main(String[] args){
        Target target = new Adapter(new Adaptee());
        target.Request();
    }
}

