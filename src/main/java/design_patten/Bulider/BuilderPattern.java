package design_patten.Bulider;

public class BuilderPattern {
    public static void main(String[] args){
        Director director = new Director();

        System.out.println("组装老年机");
        Builder bulider1 = new ConcreteBuilder1();
        director.Construct(bulider1);
        Phone commonPhone = bulider1.getPhone();
        commonPhone.Show();

        System.out.println("组装拍照手机");
        Builder bulider2 = new ConcreteBuilder2();
        director.Construct(bulider2);
        Phone cameraPhone = bulider2.getPhone();
        cameraPhone.Show();

        System.out.println("组装旗舰版手机");
        Builder bulider3 = new ConcreteBuilder3();
        director.Construct(bulider3);
        Phone ulimatePhone = bulider3.getPhone();
        ulimatePhone.Show();

    }
}
