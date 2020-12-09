package design_patten.Factory;

public class Factory2 extends Factory {
    @Override
    public Phone Manufacture() {
        return new CameraPhone();
    }
}
