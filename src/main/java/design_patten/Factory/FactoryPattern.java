package design_patten.Factory;

public class FactoryPattern {
    public static void main(String[] args){

        Factory1 factory1 = new Factory1();
        factory1.Manufacture().Show();

        Factory2 factory2 = new Factory2();
        factory2.Manufacture().Show();

        Factory3 factory3 = new Factory3();
        factory3.Manufacture().Show();
    }
}
