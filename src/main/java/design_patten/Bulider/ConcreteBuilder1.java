package design_patten.Bulider;

public class ConcreteBuilder1 extends Builder {
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
    public void BuildCamera(){ }
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
