package design_patten.Bulider;

public abstract class Builder {
    public abstract void BuildCPU();
    public abstract void BuildRAM();
    public abstract void BuildBattery();
    public abstract void BuildScreen();
    public abstract void BuildCamera();
    public abstract void BuildGPS();
    public abstract void BuildFingerprint();
    public abstract void BuildNFC();
    public abstract Phone getPhone();
}
