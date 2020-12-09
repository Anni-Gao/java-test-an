package design_patten.Bulider;

public class Director {
    public void Construct(Builder builder){
        builder.BuildCPU();
        builder.BuildRAM();
        builder.BuildBattery();
        builder.BuildScreen();
        builder.BuildCamera();
        builder.BuildGPS();
        builder.BuildFingerprint();
        builder.BuildNFC();
    }
}
