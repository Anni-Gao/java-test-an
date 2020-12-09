package design_patten.Bulider;

public class ConcreteBuilder3 extends Builder {
    Phone phone = new Phone();

    @Override
    public void BuildCPU(){
        phone.Add("CPU");
    }
    @Override
    public void BuildRAM(){
        phone.Add("内存");
    }
    @Override
    public void BuildBattery(){
        phone.Add("电池");
    }
    @Override
    public void BuildScreen(){
        phone.Add("屏幕");
    }
    @Override
    public void BuildCamera(){
        phone.Add("相机");
    }
    @Override
    public void BuildGPS() {
        phone.Add("GPS");
    }
    @Override
    public void BuildNFC() {
        phone.Add("NFC");
    }
    @Override
    public void BuildFingerprint() {
        phone.Add("指纹识别");
    }
    @Override
    public Phone getPhone() {
        return phone;
    }
}
