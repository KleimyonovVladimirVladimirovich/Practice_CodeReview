package patterns.factorymethod;

public class CarPlant extends Plant {


    @Override
    public Transport createTransport() {
        return new Car();
    }
}

class MotorcyclePlant extends Plant {
    @Override
    public Transport createTransport() {
        return new Motorcycle();
    }

}
