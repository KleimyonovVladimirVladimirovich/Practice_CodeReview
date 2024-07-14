package Car;

public class Test_Assembly {
    public static void main(String[] args) {
        //****
        FrameCarBMW frameBMW = new FrameCarBMW();
        EngineBMW engineBMW = new EngineBMW();
        WehicleBMW wehicleBMW = new WehicleBMW();
        //****
        FrameCarSubaru frameSubaru = new FrameCarSubaru();
        EngineSubaru engineSubaru = new EngineSubaru();
        WehicleSubaru wehicleSubaru = new WehicleSubaru();
        //****

        Car BMW = new Car(frameBMW, engineBMW, wehicleBMW);
        Car Subaru = new Car(frameSubaru, engineSubaru, wehicleSubaru);
    }
    //Пример сильной зависимости, теперь пример внедрения
}
