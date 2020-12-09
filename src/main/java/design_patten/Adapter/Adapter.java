package design_patten.Adapter;

public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter (Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void Request() {
        this.adaptee.SpecificRequest();
        System.out.println("适配成功！");
    }
}
