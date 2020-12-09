package design_patten.Observer;

public class ObservePattern {
    public static void main(String[] args){
        Subject componentQuality = new ComponentQuality();

        Observer worker1 = new Worker("工人A");
        Observer worker2 = new Worker("工人B");
        Observer qualityController1 = new QualityController("质管员A");
        Observer qualityController2 = new QualityController("质管员B");

        componentQuality.AddObserver(worker1);
        componentQuality.AddObserver(worker2);
        componentQuality.AddObserver(qualityController1);
        componentQuality.AddObserver(qualityController2);

        componentQuality.NotifyObserver("部件质量消息源错误信息");
    }

}
