package design_patten.Bulider;

public class ConcreteBuilder2 extends Builder {
    Phone phone = new Phone();
    @Override
    public void BuildCPU(){
        phone.Add("组装CPU");
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
    public void BuildGPS() { }
    @Override
    public void BuildFingerprint() { }
    @Override
    public void BuildNFC() { }
    @Override
    public Phone getPhone() {
        return phone;
    }
}
