package Car;

public class Dependency_Injection_CarSubaru {

    private FrameCarSubaru frameCarSubaru;
    private EngineSubaru engineSubaru;
    private WehicleSubaru wehicleSubaru;

    public Dependency_Injection_CarSubaru(FrameCarSubaru frameCarSubaru, EngineSubaru engineSubaru, WehicleSubaru wehicleSubaru) {
        this.frameCarSubaru = frameCarSubaru;
        this.engineSubaru = engineSubaru;
        this.wehicleSubaru = wehicleSubaru;
    }
    public Dependency_Injection_CarSubaru() {}
}
