package design_patten.Observer;

public class Worker implements Observer {

    private String name;
    public Worker(String name) {
        this.name = name;
    }
    public void Check() {
        System.out.println(name + "去核查信息");
    }
    @Override
    public void Update(String message) {
        System.out.println(name + "收到了信息" + message);
        Check();
    }

}
