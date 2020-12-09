package design_patten.Factory;

public class Factory3 extends Factory {
    @Override
    public Phone Manufacture() {
        return new UlimatePhone();
    }
}
