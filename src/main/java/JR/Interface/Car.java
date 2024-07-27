package JR.Interface;

import JR.Interface.contracts.Interface;
import JR.Interface.contracts.Sellable;

import java.io.Serializable;

public class Car implements Interface, Sellable, Serializable, Cloneable {
    public static void main(String[] args) {}
    void someText() {
        System.out.println("something text...");
    }

    @Override
    public void goStraight() {
        System.out.println("Hai");
    }

    @Override
    public void goBack() {
        System.out.println("Im");
    }

    @Override
    public void goLeft() {
        System.out.println("Car");
    }

    @Override
    public void toMove() {

    }
}
