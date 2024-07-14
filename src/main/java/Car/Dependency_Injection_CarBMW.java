package Car;

public class Dependency_Injection_CarBMW {

    private FrameCarBMW frameCar;
    private EngineBMW engine;
    private WehicleBMW wehicle;

    public Dependency_Injection_CarBMW(FrameCarBMW frameCar, EngineBMW engine, WehicleBMW wehicle) {
        this.frameCar = frameCar;
        this.engine = engine;
        this.wehicle = wehicle;
    }
    public Dependency_Injection_CarBMW() {}


    public static void main(String[] args) {}

}
