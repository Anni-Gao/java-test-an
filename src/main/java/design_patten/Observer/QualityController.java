package design_patten.Observer;

public class QualityController implements Observer {
    private String name;
    public QualityController(String name) {
        this.name = name;
    }
    public void Record() {
        System.out.println(name + "记录信息");
    }

    @Override
    public void Update(String message) {
        System.out.println(name + "收到了信息" + message);
        Record();
    }

}
