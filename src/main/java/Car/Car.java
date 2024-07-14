package Car;

public class Car {

    private FrameCar frameCar;
    private Engine engine;
    private Wehicle wehicle;

    public Car(FrameCar frameCar, Engine engine, Wehicle wehicle) {
        this.frameCar = frameCar;
        this.engine = engine;
        this.wehicle = wehicle;
    }  //Внедрение зависимости через конструктор
    public Car() {}
}