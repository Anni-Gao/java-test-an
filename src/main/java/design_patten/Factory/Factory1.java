package design_patten.Factory;

public class Factory1 extends Factory{
    @Override
    public Phone Manufacture() {
        return new CommonPhone();
    }
}
